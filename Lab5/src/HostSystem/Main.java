package HostSystem;

import java.io.*;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
public class Main {
	public static void main (String[] args) throws IOException, ParserConfigurationException{
		System.out.println("Collection manager by Quoc Anh Pham is running!");
		CollectionManager collectionManager;
		try {
			collectionManager = new CollectionManager();
			Commander commander = new Commander(collectionManager);
			commander.interactiveMod();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
}

