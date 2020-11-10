/* The following code was generated by JFlex 1.4.3 on 11/9/20 6:53 PM */

package code;
import java_cup.runtime.*;
import java.util.ArrayList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/9/20 6:53 PM from the specification file
 * <tt>./src/code/Lexer.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int onelinecomment = 4;
  public static final int YYINITIAL = 0;
  public static final int comment = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1, 46,  0,  0,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  6, 45, 43,  0,  2,  0, 42, 32, 33,  8,  7, 37,  7, 36,  9, 
    27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 38, 39,  5,  3,  4,  0, 
     0, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 
    26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 34,  0, 35,  0,  0, 
     0, 10, 19, 17, 12, 22, 29, 26, 18, 15, 26, 25, 20, 21, 11, 13, 
    44, 26, 14, 23, 16, 28, 26, 24, 26, 26, 26, 30, 40, 31, 41,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\1\2\4\1\5\1\6"+
    "\2\7\17\10\1\11\1\10\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\10\1\30\2\2\1\31\1\32\1\4"+
    "\1\0\1\33\5\34\1\35\3\34\1\36\13\34\1\37"+
    "\4\34\1\40\1\41\1\42\4\34\1\43\1\44\7\34"+
    "\1\45\4\34\1\46\2\34\1\0\1\47\2\34\1\50"+
    "\1\51\1\52\1\53\2\34\1\54\2\34\1\55\3\34"+
    "\1\56\1\34\1\0\2\34\1\57\1\34\1\60\2\34"+
    "\1\61\1\62\1\63\1\64\1\34\1\65\1\66\1\34"+
    "\1\67\1\0\1\70\1\71\1\0\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\215\0\353\0\u011a"+
    "\0\u0149\0\u011a\0\215\0\215\0\u0178\0\u01a7\0\u01d6\0\u0205"+
    "\0\u0234\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d"+
    "\0\u03ac\0\u03db\0\u040a\0\u0439\0\u0468\0\u0497\0\215\0\215"+
    "\0\215\0\215\0\215\0\215\0\215\0\215\0\215\0\215"+
    "\0\215\0\215\0\215\0\215\0\u04c6\0\215\0\215\0\u04f5"+
    "\0\u0524\0\215\0\215\0\u0553\0\215\0\u031f\0\u0582\0\u05b1"+
    "\0\u05e0\0\u060f\0\u031f\0\u063e\0\u066d\0\u069c\0\u031f\0\u06cb"+
    "\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u0843"+
    "\0\u0872\0\u08a1\0\u0468\0\u08d0\0\u08ff\0\u092e\0\u095d\0\215"+
    "\0\215\0\u031f\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u031f\0\u031f"+
    "\0\u0a48\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91"+
    "\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d\0\u031f\0\u0c7c\0\u0cab\0\u0cda"+
    "\0\u031f\0\u0d09\0\u0d38\0\u031f\0\u031f\0\u031f\0\u031f\0\u0d67"+
    "\0\u0d96\0\u031f\0\u0dc5\0\u0df4\0\u031f\0\u0e23\0\u0e52\0\u0e81"+
    "\0\u031f\0\u0eb0\0\u0edf\0\u0f0e\0\u0f3d\0\u031f\0\u0f6c\0\u031f"+
    "\0\u0f9b\0\u0fca\0\u031f\0\u031f\0\u031f\0\u0ff9\0\u1028\0\u031f"+
    "\0\u0f6c\0\u1057\0\u031f\0\u1086\0\u031f\0\u031f\0\u10b5\0\215";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\2\26\1\35\1\26\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\5\1\57\1\5"+
    "\51\57\1\60\2\57\1\5\56\57\1\61\60\0\1\5"+
    "\54\0\1\5\3\0\1\62\56\0\1\63\56\0\1\63"+
    "\27\0\1\64\76\0\1\65\15\0\1\66\1\67\2\66"+
    "\1\70\17\66\16\0\1\66\14\0\3\66\1\71\20\66"+
    "\16\0\1\66\14\0\14\66\1\72\7\66\16\0\1\66"+
    "\14\0\4\66\1\73\17\66\16\0\1\66\14\0\14\66"+
    "\1\74\5\66\1\75\1\66\16\0\1\66\14\0\1\66"+
    "\1\76\21\66\1\77\16\0\1\66\14\0\4\66\1\100"+
    "\17\66\16\0\1\66\14\0\1\101\7\66\1\102\13\66"+
    "\16\0\1\66\14\0\24\66\16\0\1\66\14\0\3\66"+
    "\1\103\1\104\17\66\16\0\1\66\14\0\14\66\1\105"+
    "\7\66\16\0\1\66\14\0\1\106\23\66\16\0\1\66"+
    "\14\0\1\66\1\107\10\66\1\110\11\66\16\0\1\66"+
    "\14\0\16\66\1\111\5\66\16\0\1\66\14\0\10\66"+
    "\1\112\13\66\16\0\1\66\35\0\1\113\35\0\1\114"+
    "\2\66\1\115\16\66\1\116\1\66\16\0\1\66\14\0"+
    "\4\66\1\117\17\66\16\0\1\66\13\0\1\120\123\0"+
    "\1\61\4\0\1\121\26\0\1\64\35\0\2\66\1\122"+
    "\21\66\16\0\1\66\14\0\4\66\1\123\17\66\16\0"+
    "\1\66\14\0\1\66\1\124\22\66\16\0\1\66\14\0"+
    "\23\66\1\125\16\0\1\66\14\0\6\66\1\126\15\66"+
    "\16\0\1\66\14\0\1\66\1\127\22\66\16\0\1\66"+
    "\14\0\6\66\1\130\15\66\16\0\1\66\14\0\22\66"+
    "\1\131\1\66\16\0\1\66\14\0\15\66\1\132\6\66"+
    "\16\0\1\66\14\0\1\133\23\66\16\0\1\66\14\0"+
    "\3\66\1\134\20\66\16\0\1\66\14\0\14\66\1\135"+
    "\7\66\16\0\1\66\14\0\6\66\1\136\15\66\16\0"+
    "\1\66\14\0\5\66\1\137\16\66\16\0\1\66\14\0"+
    "\2\66\1\140\21\66\16\0\1\66\14\0\15\66\1\141"+
    "\6\66\16\0\1\66\14\0\5\66\1\142\16\66\16\0"+
    "\1\66\14\0\5\66\1\143\16\66\16\0\1\66\14\0"+
    "\12\66\1\144\11\66\16\0\1\66\14\0\4\66\1\145"+
    "\17\66\16\0\1\66\14\0\1\66\1\146\22\66\16\0"+
    "\1\66\14\0\5\66\1\147\16\66\16\0\1\66\14\0"+
    "\24\66\4\0\1\150\11\0\1\66\14\0\14\66\1\151"+
    "\7\66\16\0\1\66\14\0\1\152\23\66\16\0\1\66"+
    "\14\0\22\66\1\153\1\66\16\0\1\66\14\0\14\66"+
    "\1\154\7\66\16\0\1\66\14\0\14\66\1\155\7\66"+
    "\16\0\1\66\14\0\4\66\1\156\17\66\16\0\1\66"+
    "\14\0\12\66\1\157\11\66\16\0\1\66\14\0\1\160"+
    "\23\66\16\0\1\66\14\0\6\66\1\161\15\66\16\0"+
    "\1\66\14\0\1\66\1\162\22\66\16\0\1\66\14\0"+
    "\5\66\1\163\5\66\1\164\10\66\16\0\1\66\14\0"+
    "\14\66\1\165\7\66\16\0\1\66\14\0\6\66\1\166"+
    "\15\66\16\0\1\66\14\0\12\66\1\167\11\66\16\0"+
    "\1\66\14\0\15\66\1\170\6\66\16\0\1\66\14\0"+
    "\7\66\1\171\14\66\16\0\1\66\14\0\1\66\1\172"+
    "\22\66\16\0\1\66\35\0\1\173\35\0\22\66\1\174"+
    "\1\66\16\0\1\66\14\0\4\66\1\175\17\66\16\0"+
    "\1\66\14\0\17\66\1\176\4\66\16\0\1\66\14\0"+
    "\14\66\1\177\7\66\16\0\1\66\14\0\23\66\1\200"+
    "\16\0\1\66\14\0\1\201\23\66\16\0\1\66\14\0"+
    "\7\66\1\202\14\66\16\0\1\66\14\0\14\66\1\203"+
    "\7\66\16\0\1\66\14\0\14\66\1\204\7\66\16\0"+
    "\1\66\14\0\6\66\1\205\15\66\16\0\1\66\35\0"+
    "\1\173\7\0\1\206\25\0\12\66\1\207\11\66\16\0"+
    "\1\66\14\0\1\66\1\210\22\66\16\0\1\66\14\0"+
    "\4\66\1\211\17\66\16\0\1\66\14\0\5\66\1\212"+
    "\16\66\16\0\1\66\14\0\10\66\1\213\13\66\16\0"+
    "\1\66\44\0\1\214\26\0\6\66\1\215\15\66\16\0"+
    "\1\66\14\0\1\66\1\216\22\66\16\0\1\66\35\0"+
    "\1\217\56\0\1\217\7\0\1\220\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4324];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\4\1\2\11\22\1\16\11"+
    "\1\1\2\11\2\1\2\11\1\0\1\11\32\1\2\11"+
    "\26\1\1\0\22\1\1\0\20\1\1\0\2\1\1\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }

    private void error(String message) {
                errores.add("Error léxico en línea "+(yyline+1)+", columna "+(yycolumn+1)+" : "+message);
		System.err.println("Lexical Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
	}

    ArrayList<String> errores = new ArrayList();



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 19: 
          { return symbol(sym.SEMICOLON, yytext());
          }
        case 58: break;
        case 22: 
          { return symbol(sym.QUOTE, yytext());
          }
        case 59: break;
        case 5: 
          { return symbol(sym.NOT, yytext());
          }
        case 60: break;
        case 18: 
          { return symbol(sym.COLON, yytext());
          }
        case 61: break;
        case 21: 
          { return symbol(sym.ASSIGN, yytext());
          }
        case 62: break;
        case 17: 
          { return symbol(sym.COMMA, yytext());
          }
        case 63: break;
        case 39: 
          { return symbol(sym.NONE, yytext());
          }
        case 64: break;
        case 33: 
          { return symbol(sym.STEP, yytext());
          }
        case 65: break;
        case 55: 
          { return symbol(sym.SWITCH, yytext());
          }
        case 66: break;
        case 15: 
          { return symbol(sym.RBRA, yytext());
          }
        case 67: break;
        case 7: 
          { return symbol(sym.MULTOP, yytext());
          }
        case 68: break;
        case 57: 
          { return symbol(sym.ENDMAIN, yytext());
          }
        case 69: break;
        case 43: 
          { return symbol(sym.BOOLEAN, yytext());
          }
        case 70: break;
        case 13: 
          { return symbol(sym.RPAR, yytext());
          }
        case 71: break;
        case 10: 
          { return symbol(sym.LKEY, yytext());
          }
        case 72: break;
        case 3: 
          { return symbol(sym.MOD, yytext());
          }
        case 73: break;
        case 44: 
          { return symbol(sym.MAIN, yytext());
          }
        case 74: break;
        case 45: 
          { return symbol(sym.ELSE, yytext());
          }
        case 75: break;
        case 36: 
          { return symbol(sym.INT, yytext());
          }
        case 76: break;
        case 23: 
          { yybegin(onelinecomment);
          }
        case 77: break;
        case 26: 
          { return symbol(sym.EQ, yytext());
          }
        case 78: break;
        case 29: 
          { return symbol(sym.OR, yytext());
          }
        case 79: break;
        case 56: 
          { return symbol(sym.DEFAULT, yytext());
          }
        case 80: break;
        case 14: 
          { return symbol(sym.LBRA, yytext());
          }
        case 81: break;
        case 25: 
          { yybegin(YYINITIAL);
          }
        case 82: break;
        case 6: 
          { return symbol(sym.SUMOP, yytext());
          }
        case 83: break;
        case 12: 
          { return symbol(sym.LPAR, yytext());
          }
        case 84: break;
        case 28: 
          { return symbol(sym.ID,yytext());
          }
        case 85: break;
        case 31: 
          { return symbol(sym.NUM, new Integer(yytext()));
          }
        case 86: break;
        case 34: 
          { return symbol(sym.LOGOP, yytext());
          }
        case 87: break;
        case 30: 
          { return symbol(sym.IF, yytext());
          }
        case 88: break;
        case 24: 
          { return symbol(sym.QUOTATION, yytext());
          }
        case 89: break;
        case 52: 
          { return symbol(sym.VARTYPE, yytext());
          }
        case 90: break;
        case 47: 
          { return symbol(sym.BREAK, yytext());
          }
        case 91: break;
        case 9: 
          { return symbol(sym.DIGIT, new Integer(yytext()));
          }
        case 92: break;
        case 50: 
          { return symbol(sym.FALSE, yytext());
          }
        case 93: break;
        case 37: 
          { return symbol(sym.END, yytext());
          }
        case 94: break;
        case 41: 
          { return symbol(sym.CASE, yytext());
          }
        case 95: break;
        case 35: 
          { return symbol(sym.RUN, yytext());
          }
        case 96: break;
        case 4: 
          { return symbol(sym.RELOP, yytext());
          }
        case 97: break;
        case 46: 
          { return symbol(sym.FUNC, yytext());
          }
        case 98: break;
        case 49: 
          { return symbol(sym.WHILE, yytext());
          }
        case 99: break;
        case 38: 
          { return symbol(sym.FOR, yytext());
          }
        case 100: break;
        case 48: 
          { return symbol(sym.ENDIF, yytext());
          }
        case 101: break;
        case 40: 
          { return symbol(sym.TRUE, yytext());
          }
        case 102: break;
        case 20: 
          { return symbol(sym.PIPE, yytext());
          }
        case 103: break;
        case 53: 
          { return symbol(sym.RETURN, yytext());
          }
        case 104: break;
        case 51: 
          { return symbol(sym.PRINT, yytext());
          }
        case 105: break;
        case 32: 
          { System.out.println("end comment");
                    yybegin(YYINITIAL);
          }
        case 106: break;
        case 42: 
          { return symbol(sym.CHAR, yytext());
          }
        case 107: break;
        case 8: 
          { return symbol(sym.LETTER, yytext());
          }
        case 108: break;
        case 16: 
          { return symbol(sym.DOT, yytext());
          }
        case 109: break;
        case 27: 
          { System.out.println("start comment");yybegin(comment);
          }
        case 110: break;
        case 54: 
          { return symbol(sym.WORD, yytext());
          }
        case 111: break;
        case 11: 
          { return symbol(sym.RKEY, yytext());
          }
        case 112: break;
        case 1: 
          { error("Caracter no reconocido <"+ yytext()+">");
          }
        case 113: break;
        case 2: 
          { 
          }
        case 114: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
