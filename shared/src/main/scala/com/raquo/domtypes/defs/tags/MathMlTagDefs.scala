package com.raquo.domtypes.defs.attrs

import com.raquo.domtypes.common.{MathMLTagType, TagDef}


object MathMLTagDefs {

    val defs: List[TagDef] = List(

      TagDef(
        tagType = MathMLTagType,
        scalaName = "math",
        domName = "math",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Math",
        javascriptElementType = "HTMLElement",
        commentLines = List(
          "The top-level element in MathML, representing a mathematical expression.",
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
        scalaJsElementTypeAlias = "dom.mathml.Mi",
        javascriptElementType = "HTMLElement",
        commentLines = List(
          "Represents a mathematical identifier, such as a variable name.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mi",
        ),
      ),

      TagDef(
        tagType = MathMLTagType,
        scalaName = "mo",
        domName = "mo",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Mo",
        javascriptElementType = "HTMLElement",
        commentLines = List(
          "Represents a mathematical operator.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo",
        ),
      ),

      TagDef(
        tagType = MathMLTagType,
        scalaName = "mn",
        domName = "mn",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Mn",
        javascriptElementType = "HTMLElement",
        commentLines = List(
          "Represents a number in a mathematical expression.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mn",
        ),
      ),

      TagDef(
        tagType = MathMLTagType,
        scalaName = "msup",
        domName = "msup",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Msup",
        javascriptElementType = "HTMLElement",
        commentLines = List(
          "Represents a superscript expression.",
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
        scalaJsElementTypeAlias = "dom.mathml.Msub",
        javascriptElementType = "HTMLElement",
        commentLines = List(
          "Represents a subscript expression.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msub",
        ),
      ),


      TagDef(
        tagType = MathMLTagType,
        scalaName = "mfrac",
        domName = "mfrac",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Mfrac",
        javascriptElementType = "HTMLElement",
        commentLines = List(
          "Represents a fraction.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac",
        ),
      ),

      TagDef(
        tagType = MathMLTagType,
        scalaName = "msqrt",
        domName = "msqrt",
        isVoid = false,
        scalaJsElementTypeAlias = "dom.mathml.Msqrt",
        javascriptElementType = "HTMLElement",
        commentLines = List(
          "Represents a square root.",
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
        scalaJsElementTypeAlias = "dom.mathml.Mroot",
        javascriptElementType = "HTMLElement",
        commentLines = List(
          "Represents a root expression with a specified degree.",
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
        scalaJsElementTypeAlias = "dom.mathml.Mtext",
        javascriptElementType = "HTMLElement",
        commentLines = List(
          "Represents text within a mathematical expression.",
        ),
        docUrls = List(
          "https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtext",
        ),
      ),

    )

  }