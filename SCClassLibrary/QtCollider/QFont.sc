QFont {
  classvar defaultSansFace, defaultSerifFace, defaultMonoFace;
  var <>name, <>size, <>bold, <>italic;
  /* ----------------- class -------------------*/

  *initClass {

  }

  *new { arg n, s, b = false, i = false;
    ^super.newCopyArgs( n, s, b, i );
  }

  *availableFonts {
    _Qt_AvailableFonts
  }

  *antiAliasing_ { arg flag;
  }

  *smoothing_ { arg flag;
  }

  *defaultSansFace {
    ^"sans-serif";
  }

  *defaultSerifFace {
    ^"serif";
  }

  *defaultMonoFace {
    ^"monospace";
  }

  *default {
    ^QFont();
  }

  /* ------------------instance------------------*/

  setDefault {
  }

  boldVariant {
    ^this.class.new( name, size, true, italic );
  }

  /* ------------------ private -----------------*/

}