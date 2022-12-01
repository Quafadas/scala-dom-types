package com.raquo.domtypes

import com.raquo.domtypes.codegen.DefType.LazyVal
import com.raquo.domtypes.codegen._
import com.raquo.domtypes.common.{HtmlTagType, SvgTagType}
import com.raquo.domtypes.defs.styles.StyleTraits
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class GeneratorSpec extends AnyFunSpec with Matchers {

  private val generator = new CanonicalGenerator(
    baseOutputDirectoryPath = "js/src/test/scala/com/thirdparty",
    basePackagePath = "com.thirdparty",
    standardTraitCommentLines = List(
      "!!! #Note: This code is generated from the data in Scala DOM Types !!!"
    ),
    format = CodeFormatting()
  )

  private val defGroups = new CanonicalDefGroups()

  it("Generate HTML tags") {
    println("=== HTML TAGS ===")

    val traitName = "HtmlTags"

    val fileContent = generator.generateTagsTrait(
      tagType = HtmlTagType,
      defGroups = defGroups.htmlTagsDefGroups,
      printDefGroupComments = true,
      traitName = traitName,
      keyKind = "HtmlTag",
      keyImplName = "htmlTag",
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.tagsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate SVG tags") {
    println("=== SVG TAGS ===")

    val traitName = "SvgTags"

    val fileContent = generator.generateTagsTrait(
      tagType = SvgTagType,
      defGroups = defGroups.svgTagsDefGroups,
      printDefGroupComments = false,
      traitName = traitName,
      keyKind = "SvgTag",
      keyImplName = "svgTag",
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.tagsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate HTML attributes ") {
    println("=== HTML ATTRS ===")

    val traitName = "HtmlAttrs"

    val fileContent = generator.generateAttrsTrait(
      defGroups = defGroups.htmlAttrDefGroups,
      printDefGroupComments = false,
      traitName = traitName,
      keyKind = "HtmlAttr",
      implNameSuffix = "HtmlAttr",
      baseImplName = "htmlAttr",
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.attrsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate SVG attributes ") {
    println("=== SVG ATTRS ===")

    val traitName = "SvgAttrs"

    val fileContent = generator.generateAttrsTrait(
      defGroups = defGroups.svgAttrDefGroups,
      printDefGroupComments = false,
      traitName = traitName,
      keyKind = "SvgAttr",
      implNameSuffix = "SvgAttr",
      baseImplName = "svgAttr",
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.attrsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate Aria attributes ") {
    println("=== ARIA ATTRS ===")

    val traitName = "AriaAttrs"

    val fileContent = generator.generateAttrsTrait(
      defGroups = defGroups.ariaAttrDefGroups,
      printDefGroupComments = false,
      traitName = traitName,
      keyKind = "AriaAttr",
      implNameSuffix = "AriaAttr",
      baseImplName = "ariaAttr",
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.attrsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate HTML Props") {
    println("=== HTML Props ===")

    val traitName = "Props"

    val fileContent = generator.generatePropsTrait(
      defGroups = defGroups.propDefGroups,
      printDefGroupComments = true,
      traitName = traitName,
      keyKind = "Prop",
      implNameSuffix = "Prop",
      baseImplName = "prop",
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.propsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate Event Props") {
    println("=== Event Props ===")

    val traitName = "EventProps"

    val fileContent = generator.generateEventPropsTrait(
      defSources = defGroups.eventPropDefGroups,
      printDefGroupComments = true,
      traitName = traitName,
      keyKind = "EventProp",
      keyImplName = "eventProp",
      defType = LazyVal
    )

    generator.writeToFile(
      packagePath = generator.eventPropsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate Style Props") {
    println("=== Style Props ===")

    val traitName = "StyleProps"

    val fileContent = generator.generateStylePropsTrait(
      defSources = defGroups.stylePropDefGroups,
      printDefGroupComments = true,
      traitName = traitName,
      keyKind = "StyleProp",
      keyKindAlias = "StyleProp",
      derivedKeyKind = "DerivedStyleProp",
      derivedKeyKindAlias = "DSP",
      baseImplName = "styleProp",
      defType = LazyVal,
      lengthUnitsNumType = "Int",
      outputUnitTraits = true
    )

    generator.writeToFile(
      packagePath = generator.stylePropsPackagePath,
      fileName = traitName,
      fileContent = fileContent
    )
  }

  it("Generate Style Keywords") {
    println("=== Style Keywords ===")

    def transformUnitTraitName(unitType: String): String = {
      unitType match {
        case "Length" => "Length[_, Int]"
        case other => other + "[_]"
      }
    }

    StyleTraits.defs.foreach { styleTrait =>
      val keywordDefGroups = List(
        "Keywords" -> styleTrait.keywords  // #TODO this should be in the defs
      )
      val fileContent = generator.generateStyleKeywordsTrait(
        defSources = keywordDefGroups,
        printDefGroupComments = false,
        traitName = styleTrait.scalaName,
        extendsTraits = styleTrait.extendsTraits,
        extendsUnitTraits = styleTrait.extendsUnits.map(transformUnitTraitName),
        propKind = "StyleProp",
        keywordKind = "StyleSetter",
        derivedKeyKind = "DerivedStyleProp",
        defType = LazyVal,
        outputUnitTypes = true
      )

      generator.writeToFile(
        packagePath = generator.styleTraitsPackagePath(),
        fileName = styleTrait.scalaName,
        fileContent = fileContent
      )
    }
  }

}