QTextView : QAbstractScroll {
  var <stringColor, <font, <editable=true;

  *qtClass { ^"QcTextEdit" }

  enterInterpretsSelection { ^this.getProperty( \enterInterpretsSelection ); }

  enterInterpretsSelection_ { arg bool;
    this.setProperty( \enterInterpretsSelection, bool );
  }

  editable_ { arg aBool;
    editable = aBool;
    this.setProperty( \readOnly, aBool.not );
  }

  usesTabToFocusNextView_ { arg aBool;
    this.setProperty( \tabChangesFocus, aBool );
  }

  open { arg aString;
    this.setProperty( \document, aString );
  }

  string {
    ^this.getProperty( \plainText );
  }

  string_ { arg aString;
    this.setProperty( \plainText, aString );
  }

  font_ { arg aFont;
    font = aFont;
    this.setProperty( \textFont, aFont );
  }

  stringColor_ { arg aColor;
    stringColor = aColor;
    this.setProperty( \textColor, aColor );
  }

  selectedString {
    ^this.getProperty( \selectedString );
  }

  selectionStart {
    ^this.getProperty( \selectionStart );
  }

  selectionSize {
    ^this.getProperty( \selectionSize );
  }

  select { arg start, size;
    this.invokeMethod( \select, [start, size] );
  }

  setStringColor { arg aColor, intStart, intSize;
    this.setProperty( \rangeColor, [aColor,intStart,intSize] );
  }

  setFont { arg aFont, intStart, intSize;
    this.setProperty( \rangeFont, [aFont,intStart,intSize] );
  }

  setString { arg aString, intStart, intSize;
    this.setProperty( \rangeText, [aString,intStart,intSize] );
  }

  tabWidth { ^this.getProperty( \tabStopWidth ); }

  tabWidth_ { arg pixels; this.setProperty( \tabStopWidth, pixels ); }

  syntaxColorize {
    this.nonimpl( "syntaxColorize" );
  }
}