package hu.iit.me.service;

import com.sun.javafx.collections.ElementObservableListDecorator;
import hu.iit.me.model.Khajo;
import hu.iit.me.model.Orszag;
import hu.iit.me.model.Szovegyseg;
import hu.iit.me.model.Uboat;
import hu.iit.me.model.Uboat.Utipus;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.events.EndElement;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class XMLManager {

    private static ArrayList<Uboat> uboatok = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static Date parseDate(String date) {
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Document createDOM() {
        Document dom = null;
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            dom = dBuilder.parse("hajozas.xml");
        } catch (Exception e) {
            e.getMessage();
        }
        return dom;
    }

    public static void addElements() {
        Document dom = createDOM();

        Szovegyseg szovegyseg = new Szovegyseg(3, "Sunderland", "Repülőgép", 3);
        Orszag orszag = new Orszag(3, "Ausztrália");

        Element szovegysegNewElem = dom.createElement("szovegyseg");
        NodeList nodeList = dom.getElementsByTagName("szovegysegek");
        Element szovegysegekOld = (Element) nodeList.item(0);

        szovegysegNewElem.setAttribute("oid", String.valueOf(szovegyseg.getOid()));
        szovegysegNewElem.setAttribute("szid", String.valueOf(szovegyseg.getSzid()));
        Element hnev = dom.createElement("hnev");
        hnev.appendChild(dom.createTextNode(szovegyseg.getHnev()));
        Element htipus = dom.createElement("htipus");
        htipus.appendChild(dom.createTextNode(szovegyseg.getHtipus()));

        szovegysegNewElem.appendChild(hnev);
        szovegysegNewElem.appendChild(htipus);
        szovegysegekOld.appendChild(szovegysegNewElem);

        Element orszagNewElem = dom.createElement("orszag");
        nodeList = dom.getElementsByTagName("orszagok");
        Element orszagokOld = (Element) nodeList.item(0);

        orszagNewElem.setAttribute("oid", String.valueOf(orszag.getOid()));
        Element onev = dom.createElement("onev");
        onev.appendChild(dom.createTextNode(orszag.getOnev()));

        orszagNewElem.appendChild(onev);
        orszagokOld.appendChild(orszagNewElem);


        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(dom);

            StreamResult result = new StreamResult("hajozas.xml");
            transformer.transform(source, result);
        }catch (Exception e) {
            e.getMessage();
        }
    }

    public static void modifyData() {
        Document dom = createDOM();

        NodeList nodeList = dom.getElementsByTagName("parancsnok");
        Element parancsnok = (Element) nodeList.item(2);

        parancsnok.getElementsByTagName("nev").item(0).setTextContent("Fritz Frauenheim");
        parancsnok.getElementsByTagName("orjaratok").item(0).setTextContent("9");
        parancsnok.getElementsByTagName("kituntetesek").item(0).setTextContent("4");
        parancsnok.getElementsByTagName("tapasztalat").item(0).setTextContent("harcedzett");

        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(dom);

            StreamResult result = new StreamResult("hajozas.xml");
            transformer.transform(source, result);
        }catch (Exception e) {
            e.getMessage();
        }
    }


    public static void readUboat() {
        Document dom = createDOM();
        dom.getDocumentElement().normalize();

        NodeList nodeList = dom.getElementsByTagName("uboat");
        for(int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                NamedNodeMap attributes = element.getAttributes();

                int uid = Integer.parseInt(element.getAttribute("uid"));
                int szid = 0;
                if(attributes.getLength() == 2) {
                    szid = Integer.parseInt(element.getAttribute("szid"));
                }
                String unev = element.getElementsByTagName("unev").item(0).getTextContent();
                Utipus utipus = Utipus.valueOf(element.getElementsByTagName("utipus").item(0).getTextContent());
                Date elveszett = parseDate(element.getElementsByTagName("elveszett").item(0).getTextContent());
                String vesztesegOka = element.getElementsByTagName("veszteseg_oka").item(0).getTextContent();

                Uboat uboat = new Uboat(uid, szid, unev, utipus, elveszett, vesztesegOka);
                uboatok.add(uboat);
            }
        }
    }

    public static void listUboats() {
        readUboat();
        for(Uboat u : uboatok) {
            System.out.println(u.toString());
        }
    }

}
