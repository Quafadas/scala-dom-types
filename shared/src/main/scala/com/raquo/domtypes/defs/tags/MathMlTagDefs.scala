package com.raquo.domtypes.defs.tags

import com.raquo.domtypes.common.{MathMLTagType, TagDef}

object MathMlTagDefs {
  
  val defs: List[TagDef] = List(
    
    TagDef(
      tagType = MathMLTagType,
      scalaName = "math",
      domName = "math",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The top-level element in MathML is math. Every valid MathML instance",
        "must be wrapped in math tags. In addition you must not nest a second",
        "math element in another, but you can have an arbitrary number of other",
        "child elements in it.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "mi",
      domName = "mi",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The mi element indicates that the content should be rendered as an",
        "identifier such as function names, variables or symbolic constants.",
        "You can also have arbitrary text in it to mark up terms.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mi",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "mn",
      domName = "mn",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The mn element represents a numeric literal which is normally a",
        "sequence of digits with a possible separator (a dot or a comma).",
        "However, it is also allowed to have arbitrary text in it which is",
        "actually a numeric quantity, for example \"eleven\".",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mn",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "mo",
      domName = "mo",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The mo element represents an operator in a broad sense. Besides",
        "operators in strict mathematical meaning, this element also includes",
        "\"operators\" like parentheses, separators like comma and semicolon,",
        "or \"absolute value\" bars.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "mrow",
      domName = "mrow",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The mrow element is used to group sub-expressions, which usually",
        "contain one or more operators with their respective operands",
        "(such as mi and mn). This element renders as a horizontal row",
        "containing its arguments.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mrow",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "mfrac",
      domName = "mfrac",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The mfrac element is used to display fractions. It can also be",
        "used to mark up fraction-like objects such as binomial coefficients",
        "and Legendre symbols.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "msup",
      domName = "msup",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The msup element is used to attach a superscript to an expression.",
        "It uses the syntax: msup base superscript",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msup",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "msub",
      domName = "msub",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The msub element is used to attach a subscript to an expression.",
        "It uses the syntax: msub base subscript",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msub",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "msubsup",
      domName = "msubsup",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The msubsup element is used to attach both a subscript and a",
        "superscript, together, to an expression.",
        "It uses the syntax: msubsup base subscript superscript",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msubsup",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "msqrt",
      domName = "msqrt",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The msqrt element is used to display square roots (no index is",
        "displayed). The square root accepts only one argument, which leads",
        "to the following syntax: msqrt base",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msqrt",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "mroot",
      domName = "mroot",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The mroot element is used to display roots with an explicit index.",
        "Two arguments are accepted, which leads to the syntax: mroot base index",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mroot",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "mtext",
      domName = "mtext",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The mtext element is used to render arbitrary text with no notational",
        "meaning, such as comments or annotations. To display text with notational",
        "meaning, use mi and mo instead.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtext",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "mspace",
      domName = "mspace",
      isVoid = true,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The mspace element is used to display a blank space, whose size is",
        "set by its attributes.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mspace",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "mtable",
      domName = "mtable",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The mtable element allows you to create tables or matrices.",
        "Inside a mtable only mtr and mtd elements may appear.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "mtr",
      domName = "mtr",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The mtr element represents a row in a table or a matrix.",
        "It may only appear in a mtable element. This element is similar",
        "to the tr element of HTML.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtr",
      ),
    ),

    TagDef(
      tagType = MathMLTagType,
      scalaName = "mtd",
      domName = "mtd",
      isVoid = false,
      scalaJsElementTypeAlias = "dom.html.Element",
      javascriptElementType = "Element",
      commentLines = List(
        "The mtd element represents a cell in a table or a matrix.",
        "It may only appear in a mtr element. This element is similar",
        "to the td element of HTML.",
      ),
      docUrls = List(
        "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtd",
      ),
    ),

  )
  
}