package com.thirdparty.defs.tags

import com.thirdparty.tags.MathTag
import org.scalajs.dom

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait MathMLTags {


  def mathMLTag[El <: dom.MathMLElement](name: String): MathTag[El] = new MathTag(name)


  /**
    * The top-level element in MathML, representing a mathematical expression.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math math @ MDN]]
    */
  lazy val math: MathTag[dom.MathMLElement] = mathMLTag("math")


  /**
    * Represents a mathematical identifier, such as a variable name.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mi mi @ MDN]]
    */
  lazy val mi: MathTag[dom.MathMLElement] = mathMLTag("mi")


  /**
    * Represents a mathematical operator.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo mo @ MDN]]
    */
  lazy val mo: MathTag[dom.MathMLElement] = mathMLTag("mo")


  /**
    * Represents a number in a mathematical expression.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mn mn @ MDN]]
    */
  lazy val mn: MathTag[dom.MathMLElement] = mathMLTag("mn")


  /**
    * Represents a superscript expression.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msup msup @ MDN]]
    */
  lazy val msup: MathTag[dom.MathMLElement] = mathMLTag("msup")


  /**
    * Represents a subscript expression.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msub msub @ MDN]]
    */
  lazy val msub: MathTag[dom.MathMLElement] = mathMLTag("msub")


  /**
    * Represents a fraction.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac mfrac @ MDN]]
    */
  lazy val mfrac: MathTag[dom.MathMLElement] = mathMLTag("mfrac")


  /**
    * Represents a square root.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msqrt msqrt @ MDN]]
    */
  lazy val msqrt: MathTag[dom.MathMLElement] = mathMLTag("msqrt")


  /**
    * Represents a root expression with a specified degree.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mroot mroot @ MDN]]
    */
  lazy val mroot: MathTag[dom.MathMLElement] = mathMLTag("mroot")


  /**
    * Represents text within a mathematical expression.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtext mtext @ MDN]]
    */
  lazy val mtext: MathTag[dom.MathMLElement] = mathMLTag("mtext")


  /**
    * The <munder> MathML element is used to attach an accent or a limit under an expression. It uses the following syntax: <munder> base underscript </munder>
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/munderover munderover @ MDN]]
    */
  lazy val munderover: MathTag[dom.MathMLElement] = mathMLTag("munderover")


  /**
    * The <mtr> MathML element represents a row in a table or a matrix. It may only appear in a <mtable> element and its children are <mtd> elements representing cells. This element is similar to the <tr> element of HTML.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtr mtr @ MDN]]
    */
  lazy val mtr: MathTag[dom.MathMLElement] = mathMLTag("mtr")


  /**
    * The <mtd> MathML element represents a cell in a table or a matrix. It may only appear in an <mtr> element.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtd mtd @ MDN]]
    */
  lazy val mtd: MathTag[dom.MathMLElement] = mathMLTag("mtd")


  /**
    * The <mtable> MathML element allows you to create tables or matrices. Its children are <mtr> elements (representing rows), each of them having <mtd> elements as its children (representing cells). These elements are similar to <table>, <tr> and <td> elements of HTML.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable mtable @ MDN]]
    */
  lazy val mtable: MathTag[dom.MathMLElement] = mathMLTag("mtable")


  /**
    * Represents a base with both a subscript and a superscript.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msubsup msubsup @ MDN]]
    */
  lazy val msubsup: MathTag[dom.MathMLElement] = mathMLTag("msubsup")


  /**
    * The <mstyle> MathML element is used to change the style of its contents. It is similar to the <style> element in HTML.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mstyle mstyle @ MDN]]
    */
  lazy val mstyle: MathTag[dom.MathMLElement] = mathMLTag("mstyle")


  /**
    * The <mspace> MathML element is used to display a blank space, whose size is set by its attributes.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mspace mspace @ MDN]]
    */
  lazy val mspace: MathTag[dom.MathMLElement] = mathMLTag("mspace")


  /**
    * Represents a string literal.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/ms ms @ MDN]]
    */
  lazy val ms: MathTag[dom.MathMLElement] = mathMLTag("ms")


}
