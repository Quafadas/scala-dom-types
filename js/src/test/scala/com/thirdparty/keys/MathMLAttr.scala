package com.thirdparty.keys

class MathMLAttr[V](
  override val domName: String,
  override val codec: com.thirdparty.codecs.Codec[V, String],
  val namespace: Option[String]
) extends Attr[V]