package com.thirdparty.defs.attrs

import com.thirdparty.keys.MathMLAttr
import com.thirdparty.codecs._

// #NOTE: GENERATED CODE
//  - This file is generated at compile time from the data in Scala DOM Types
//  - See `GeneratorSpec.scala` for code generation params
//  - Contribute to https://github.com/raquo/scala-dom-types to add missing tags / attrs / props / etc.

trait MathMLAttrs {

  def stringMathMLAttr(name: String, namespace: Option[String] = None): MathMLAttr[String] = new MathMLAttr(name, StringAsIs, namespace)
  def booleanMathMLAttr(name: String, namespace: Option[String] = None): MathMLAttr[Boolean] = new MathMLAttr(name, BooleanAsPresence, namespace)
  def intMathMLAttr(name: String, namespace: Option[String] = None): MathMLAttr[Int] = new MathMLAttr(name, IntAsString, namespace)

  /**
    * This enumerated attribute specifies how the enclosed MathML markup should be rendered.
    * It can have one of the following values:
    * - block, which means that this element will be displayed in its own block outside the current span of text
    * - inline, which means that this element will be displayed inside the current span of text
    * 
    * If not present, its default value is inline.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/display display @ MDN]]
    */
  lazy val display: MathMLAttr[String] = stringMathMLAttr("display")

  /**
    * This attribute specifies the logical class of the identifier, which varies
    * in typography. That is, although the names suggest the typographic style for
    * the class, semantically, items with the same class are treated "the same"
    * within an expression, which might or might not involve displaying them with
    * the same typography.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathvariant mathvariant @ MDN]]
    */
  lazy val mathvariant: MathMLAttr[String] = stringMathMLAttr("mathvariant")

  /**
    * This attribute specifies the size of the content. Possible values are:
    * - small: The content is rendered smaller than the surrounding text.
    * - normal: The content is rendered at the same size as the surrounding text.
    * - big: The content is rendered larger than the surrounding text.
    * - A length value like '12pt', '2em', etc.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathsize mathsize @ MDN]]
    */
  lazy val mathsize: MathMLAttr[String] = stringMathMLAttr("mathsize")

  /**
    * This attribute sets the text color and also the fraction line color.
    * You can use named colors or RGB format like #rgb, #rrggbb and CSS color names.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathcolor mathcolor @ MDN]]
    */
  lazy val mathcolor: MathMLAttr[String] = stringMathMLAttr("mathcolor")

  /**
    * This attribute sets the background color. You can use named colors
    * or RGB format like #rgb, #rrggbb and CSS color names.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathbackground mathbackground @ MDN]]
    */
  lazy val mathbackground: MathMLAttr[String] = stringMathMLAttr("mathbackground")

  /**
    * This Boolean attribute specifies whether more vertical space is used
    * for displayed equations or, if set to false, a more compact layout
    * is used to display formulas.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/displaystyle displaystyle @ MDN]]
    */
  lazy val displaystyle: MathMLAttr[Boolean] = booleanMathMLAttr("displaystyle")

  /**
    * This attribute specifies a scriptlevel for the element. Larger values
    * mean smaller font sizes. The scriptlevel is used to control the font size
    * in a context-dependent way.
    * 
    * [[https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/scriptlevel scriptlevel @ MDN]]
    */
  lazy val scriptlevel: MathMLAttr[Int] = intMathMLAttr("scriptlevel")

}