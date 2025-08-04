package com.thirdparty.defs.tags

import com.thirdparty.tags.MathMLTag
import org.scalajs.dom

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait MathMLTags {

  def mathMLTag[El <: dom.Element](name: String): MathMLTag[El] = new MathMLTag(name)

  /**
    * The top-level element in MathML is math. Every valid MathML instance
    * must be wrapped in math tags. In addition you must not nest a second
    * math element in another, but you can have an arbitrary number of other
    * child elements in it.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math math @ MDN]]
    */
  lazy val math: MathMLTag[dom.Element] = mathMLTag("math")

  /**
    * The mi element indicates that the content should be rendered as an
    * identifier such as function names, variables or symbolic constants.
    * You can also have arbitrary text in it to mark up terms.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mi mi @ MDN]]
    */
  lazy val mi: MathMLTag[dom.Element] = mathMLTag("mi")

  /**
    * The mn element represents a numeric literal which is normally a
    * sequence of digits with a possible separator (a dot or a comma).
    * However, it is also allowed to have arbitrary text in it which is
    * actually a numeric quantity, for example "eleven".
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mn mn @ MDN]]
    */
  lazy val mn: MathMLTag[dom.Element] = mathMLTag("mn")

  /**
    * The mo element represents an operator in a broad sense. Besides
    * operators in strict mathematical meaning, this element also includes
    * "operators" like parentheses, separators like comma and semicolon,
    * or "absolute value" bars.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo mo @ MDN]]
    */
  lazy val mo: MathMLTag[dom.Element] = mathMLTag("mo")

  /**
    * The mrow element is used to group sub-expressions, which usually
    * contain one or more operators with their respective operands
    * (such as mi and mn). This element renders as a horizontal row
    * containing its arguments.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mrow mrow @ MDN]]
    */
  lazy val mrow: MathMLTag[dom.Element] = mathMLTag("mrow")

  /**
    * The mfrac element is used to display fractions. It can also be
    * used to mark up fraction-like objects such as binomial coefficients
    * and Legendre symbols.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac mfrac @ MDN]]
    */
  lazy val mfrac: MathMLTag[dom.Element] = mathMLTag("mfrac")

  /**
    * The msup element is used to attach a superscript to an expression.
    * It uses the syntax: msup base superscript
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msup msup @ MDN]]
    */
  lazy val msup: MathMLTag[dom.Element] = mathMLTag("msup")

  /**
    * The msub element is used to attach a subscript to an expression.
    * It uses the syntax: msub base subscript
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msub msub @ MDN]]
    */
  lazy val msub: MathMLTag[dom.Element] = mathMLTag("msub")

}