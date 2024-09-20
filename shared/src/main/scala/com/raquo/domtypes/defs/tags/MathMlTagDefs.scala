package com.raquo.domtypes.defs.attrs

import com.raquo.domtypes.common.{AttrDef, HtmlTagType}


object MathMlTagDefs {

    val defs: List[TagDef] = List(

      TagDef(
        tagType = MathMlTagType,
        scalaName = "math",
        domName = "math",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Math",
        javascriptElementType = "MathMLElement",
        commentLines = List(
          "The top-level element in MathML, representing a mathematical expression.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/math",
        ),
      ),

      TagDef(
        tagType = MathMlTagType,
        scalaName = "mi",
        domName = "mi",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Mi",
        javascriptElementType = "MathMLElement",
        commentLines = List(
          "Represents a mathematical identifier, such as a variable name.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mi",
        ),
      ),

      TagDef(
        tagType = MathMlTagType,
        scalaName = "mo",
        domName = "mo",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Mo",
        javascriptElementType = "MathMLElement",
        commentLines = List(
          "Represents a mathematical operator.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo",
        ),
      ),

      TagDef(
        tagType = MathMlTagType,
        scalaName = "mn",
        domName = "mn",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Mn",
        javascriptElementType = "MathMLElement",
        commentLines = List(
          "Represents a number in a mathematical expression.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mn",
        ),
      ),

      TagDef(
        tagType = MathMlTagType,
        scalaName = "msup",
        domName = "msup",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Msup",
        javascriptElementType = "MathMLElement",
        commentLines = List(
          "Represents a superscript expression.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msup",
        ),
      ),

      TagDef(
        tagType = MathMlTagType,
        scalaName = "msub",
        domName = "msub",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Msub",
        javascriptElementType = "MathMLElement",
        commentLines = List(
          "Represents a subscript expression.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msub",
        ),
      ),


      TagDef(
        tagType = MathMlTagType,
        scalaName = "mfrac",
        domName = "mfrac",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Mfrac",
        javascriptElementType = "MathMLElement",
        commentLines = List(
          "Represents a fraction.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac",
        ),
      ),

      TagDef(
        tagType = MathMlTagType,
        scalaName = "msqrt",
        domName = "msqrt",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Msqrt",
        javascriptElementType = "MathMLElement",
        commentLines = List(
          "Represents a square root.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msqrt",
        ),
      ),

      TagDef(
        tagType = MathMlTagType,
        scalaName = "mroot",
        domName = "mroot",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Mroot",
        javascriptElementType = "MathMLElement",
        commentLines = List(
          "Represents a root expression with a specified degree.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mroot",
        ),
      ),

      TagDef(
        tagType = MathMlTagType,
        scalaName = "mtext",
        domName = "mtext",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Mtext",
        javascriptElementType = "MathMLElement",
        commentLines = List(
          "Represents text within a mathematical expression.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtext",
        ),
      ),

    )

  }