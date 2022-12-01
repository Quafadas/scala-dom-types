package com.thirdparty.defs.styles.traits

import com.thirdparty.keys.StyleProp
import com.thirdparty.setters.StyleSetter

/** !!! #Note: This code is generated from the data in Scala DOM Types !!! */
trait OverflowWrap extends Normal { this: StyleProp[_] => 

  /** Indicates that lines may only break at normal word break points. */
  override lazy val normal: StyleSetter[_] = super.normal

  /**
    * Indicates that normally unbreakable words may be broken at arbitrary
    * points if there are no otherwise acceptable break points in the line.
    */
  lazy val breakWord: StyleSetter[_] = this := "break-word"

}