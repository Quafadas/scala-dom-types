package com.thirdparty.defs.tags

import com.thirdparty.tags.MathTag
import org.scalajs.dom

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait MathMLTags {


  def mathTag[El <: dom.html.Element](name: String): MathTag[El] = new MathTag(name)


  /**
    * The top-level element in MathML, representing a mathematical expression.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math math @ MDN]]
    */
  lazy val math: MathTag[dom.HTMLElement] = mathTag("math")


  /**
    * Represents a mathematical identifier, such as a variable name.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mi mi @ MDN]]
    */
  lazy val mi: MathTag[dom.HTMLElement] = mathTag("mi")


  /**
    * Represents a mathematical operator.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo mo @ MDN]]
    */
  lazy val mo: MathTag[dom.HTMLElement] = mathTag("mo")


  /**
    * Represents a number in a mathematical expression.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mn mn @ MDN]]
    */
  lazy val mn: MathTag[dom.HTMLElement] = mathTag("mn")


  /**
    * Represents a superscript expression.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msup msup @ MDN]]
    */
  lazy val msup: MathTag[dom.HTMLElement] = mathTag("msup")


  /**
    * Represents a subscript expression.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msub msub @ MDN]]
    */
  lazy val msub: MathTag[dom.HTMLElement] = mathTag("msub")


  /**
    * Represents a fraction.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac mfrac @ MDN]]
    */
  lazy val mfrac: MathTag[dom.HTMLElement] = mathTag("mfrac")


  /**
    * Represents a square root.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msqrt msqrt @ MDN]]
    */
  lazy val msqrt: MathTag[dom.HTMLElement] = mathTag("msqrt")


  /**
    * Represents a root expression with a specified degree.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mroot mroot @ MDN]]
    */
  lazy val mroot: MathTag[dom.HTMLElement] = mathTag("mroot")


  /**
    * Represents text within a mathematical expression.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtext mtext @ MDN]]
    */
  lazy val mtext: MathTag[dom.HTMLElement] = mathTag("mtext")


}
