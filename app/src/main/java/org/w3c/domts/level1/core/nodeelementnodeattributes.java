
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:


Copyright (c) 2001 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University). All
Rights Reserved. This program is distributed under the W3C's Software
Intellectual Property License. This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.
See W3C License http://www.w3.org/Consortium/Legal/ for more details.

*/

package org.w3c.domts.level1.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *     The "getAttributes()" method invoked on an Element
 *     Node returns a NamedNodeMap containing the attributes
 *     of this node.
 *     
 *     Retrieve the last child of the third employee and
 *     invoke the "getAttributes()" method.   It should return
 *     a NamedNodeMap containing the attributes of the Element
 *     node. 
* @author NIST
* @author Mary Brady
* @see <a href="http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-84CF096">http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-84CF096</a>
*/
public final class nodeelementnodeattributes extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public nodeelementnodeattributes(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "staff", false);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      NodeList elementList;
      Element testAddr;
      NamedNodeMap addrAttr;
      Node attrNode;
      String attrName;
      java.util.Collection attrList = new java.util.ArrayList();
      
      java.util.Collection expected = new java.util.ArrayList();
      expected.add("domestic");
      expected.add("street");
      
      doc = (Document) load("staff", false);
      elementList = doc.getElementsByTagName("address");
      testAddr = (Element) elementList.item(2);
      addrAttr = testAddr.getAttributes();
      for (int indexN1005C = 0; indexN1005C < addrAttr.getLength(); indexN1005C++) {
          attrNode = (Node) addrAttr.item(indexN1005C);
    attrName = attrNode.getNodeName();
      attrList.add(attrName);
        }
      assertEquals("nodeElementNodeValueAssert1", expected, attrList);
      }
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level1/core/nodeelementnodeattributes";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(nodeelementnodeattributes.class, args);
   }
}

