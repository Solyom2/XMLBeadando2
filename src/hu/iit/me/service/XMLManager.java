package hu.iit.me.service;

import hu.iit.me.model.Khajo;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;

public class XMLManager {

    private ArrayList<Khajo> khajok = new ArrayList<>();

    public Document createDOM() {
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

}
