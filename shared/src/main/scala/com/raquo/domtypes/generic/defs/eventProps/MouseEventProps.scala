package com.raquo.domtypes.generic.defs.eventProps

import com.raquo.domtypes.generic.builders.BoundedBuilder

/**
  * Mouse Events: triggered by a mouse, or similar user actions.
  */
trait MouseEventProps[EP[_ <: DomEvent], DomEvent, DomMouseEvent <: DomEvent] { this: BoundedBuilder[EP, DomEvent] =>

  /**
    * The click event is raised when the user clicks on an element. The click
    * event will occur after the mousedown and mouseup events.
    *
    * MDN
    */
  lazy val onClick: EP[DomMouseEvent] = build("click")

  /**
    * The dblclick event is fired when a pointing device button (usually a
    * mouse button) is clicked twice on a single element.
    *
    * MDN
    */
  lazy val onDblClick: EP[DomMouseEvent] = build("dblclick")

  /**
    * Script to be run when an element is dragged
    */
  val onDrag: EP[DomMouseEvent] = build("drag")

  /**
    * Script to be run at the end of a drag operation
    */
  lazy val onDragEnd: EP[DomMouseEvent] = build("dragend")

  /**
    * Script to be run when an element has been dragged to a valid drop target
    */
  lazy val onDragEnter: EP[DomMouseEvent] = build("dragenter")

  /**
    * Script to be run when an element leaves a valid drop target
    */
  lazy val onDragLeave: EP[DomMouseEvent] = build("dragleave")

  /**
    * Script to be run when an element is being dragged over a valid drop target
    */
  lazy val onDragOver: EP[DomMouseEvent] = build("dragover")

  /**
    * Script to be run at the start of a drag operation
    */
  lazy val onDragStart: EP[DomMouseEvent] = build("dragstart")

  /**
    * Script to be run when dragged element is being dropped
    */
  lazy val onDrop: EP[DomMouseEvent] = build("drop")

  /**
    * The mousedown event is raised when the user presses the mouse button.
    *
    * MDN
    */
  lazy val onMouseDown: EP[DomMouseEvent] = build("mousedown")

  /**
    * The mousemove event is raised when the user moves the mouse.
    *
    * MDN
    */
  lazy val onMouseMove: EP[DomMouseEvent] = build("mousemove")

  /**
    * The mouseout event is raised when the mouse leaves an element (e.g, when
    * the mouse moves off of an image in the web page, the mouseout event is
    * raised for that image element).
    *
    * MDN
    */
  lazy val onMouseOut: EP[DomMouseEvent] = build("mouseout")

  /**
    * The mouseover event is raised when the user moves the mouse over a
    * particular element.
    *
    * MDN
    */
  lazy val onMouseOver: EP[DomMouseEvent] = build("mouseover")

  /**
    * The mouseup event is raised when the user releases the mouse button.
    *
    * MDN
    */
  lazy val onMouseUp: EP[DomMouseEvent] = build("mouseup")

  /**
    * Specifies the function to be called when the window is scrolled.
    *
    * MDN
    */
  lazy val onScroll: EP[DomMouseEvent] = build("scroll")

  /**
    * Fires when the mouse wheel rolls up or down over an element
    */
  lazy val onWheel: EP[DomMouseEvent] = build("wheel")
}