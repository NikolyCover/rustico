package unioeste.compiladores.lex;/* Generated By:JavaCC: Do not edit this line. LexerTokenManager.java */
import java.io.InputStream;

/** Token Manager. */
public class LexerTokenManager implements LexerConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3ffffffffffff80L) != 0L)
         {
            jjmatchedKind = 5;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0x3ffffffffffff80L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 5;
               jjmatchedPos = 1;
            }
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x3feffffffeaff00L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x1fe6f7fe2c8ff00L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 5;
               jjmatchedPos = 3;
            }
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x1ee6f4f2080cf00L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 4;
            return 1;
         }
         return -1;
      case 5:
         if ((active0 & 0xe8604320004400L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 5;
            return 1;
         }
         return -1;
      case 6:
         if ((active0 & 0xc8200000000400L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 6;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 64;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x80000L);
      case 35:
         return jjStopAtPos(0, 101);
      case 36:
         return jjStopAtPos(0, 102);
      case 37:
         jjmatchedKind = 62;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x800L);
      case 38:
         jjmatchedKind = 65;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x2008L);
      case 40:
         return jjStopAtPos(0, 109);
      case 41:
         return jjStopAtPos(0, 110);
      case 42:
         jjmatchedKind = 60;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x200L);
      case 43:
         jjmatchedKind = 58;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x80L);
      case 44:
         return jjStopAtPos(0, 94);
      case 45:
         jjmatchedKind = 59;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x400000100L);
      case 46:
         jjmatchedKind = 90;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x38000000L);
      case 47:
         jjmatchedKind = 61;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x400L);
      case 58:
         jjmatchedKind = 96;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x200000000L);
      case 59:
         return jjStopAtPos(0, 95);
      case 60:
         jjmatchedKind = 85;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1000808020L);
      case 61:
         jjmatchedKind = 81;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x800040000L);
      case 62:
         jjmatchedKind = 84;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x410040L);
      case 63:
         return jjStopAtPos(0, 103);
      case 64:
         return jjStopAtPos(0, 88);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x80000000L, 0x0L);
      case 91:
         return jjStopAtPos(0, 107);
      case 93:
         return jjStopAtPos(0, 108);
      case 94:
         jjmatchedKind = 63;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1000L);
      case 95:
         return jjStopAtPos(0, 89);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x2c0000000080L, 0x0L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0xc00000000100L, 0x0L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0xe00L, 0x0L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x1100000000000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x7000L, 0x0L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2000000038000L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1c0000L, 0x0L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x600000L, 0x0L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x4000007800000L, 0x0L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x8000000000000L, 0x0L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x10000008000000L, 0x0L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x30000000L, 0x0L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x740000000L, 0x0L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x220003800000000L, 0x0L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x4000c000000000L, 0x0L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x80000000000000L, 0x0L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x30000000000L, 0x0L);
      case 121:
         return jjMoveStringLiteralDfa1_0(0x100000000000000L, 0x0L);
      case 123:
         return jjStopAtPos(0, 105);
      case 124:
         jjmatchedKind = 66;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x4010L);
      case 125:
         return jjStopAtPos(0, 106);
      case 126:
         return jjStopAtPos(0, 104);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active1 & 0x8L) != 0L)
            return jjStopAtPos(1, 67);
         break;
      case 45:
         if ((active1 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 100);
         break;
      case 46:
         if ((active1 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 91;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x30000000L);
      case 58:
         if ((active1 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 97);
         break;
      case 60:
         if ((active1 & 0x20L) != 0L)
         {
            jjmatchedKind = 69;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x8000L);
      case 61:
         if ((active1 & 0x80L) != 0L)
            return jjStopAtPos(1, 71);
         else if ((active1 & 0x100L) != 0L)
            return jjStopAtPos(1, 72);
         else if ((active1 & 0x200L) != 0L)
            return jjStopAtPos(1, 73);
         else if ((active1 & 0x400L) != 0L)
            return jjStopAtPos(1, 74);
         else if ((active1 & 0x800L) != 0L)
            return jjStopAtPos(1, 75);
         else if ((active1 & 0x1000L) != 0L)
            return jjStopAtPos(1, 76);
         else if ((active1 & 0x2000L) != 0L)
            return jjStopAtPos(1, 77);
         else if ((active1 & 0x4000L) != 0L)
            return jjStopAtPos(1, 78);
         else if ((active1 & 0x40000L) != 0L)
            return jjStopAtPos(1, 82);
         else if ((active1 & 0x80000L) != 0L)
            return jjStopAtPos(1, 83);
         else if ((active1 & 0x400000L) != 0L)
            return jjStopAtPos(1, 86);
         else if ((active1 & 0x800000L) != 0L)
            return jjStopAtPos(1, 87);
         break;
      case 62:
         if ((active1 & 0x40L) != 0L)
         {
            jjmatchedKind = 70;
            jjmatchedPos = 1;
         }
         else if ((active1 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 98);
         else if ((active1 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 99);
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x10000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000808000L, active1, 0L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000000L, active1, 0L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000f0200000L, active1, 0L);
      case 102:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 5, 1);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x30000000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x182000000000000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L, active1, 0L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L, active1, 0L);
      case 110:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(1, 5, 1);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(1, 5, 1);
         return jjMoveStringLiteralDfa2_0(active0, 0x40004000002000L, active1, 0L);
      case 111:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 5, 1);
         return jjMoveStringLiteralDfa2_0(active0, 0x800003420600L, active1, 0L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x210001800000900L, active1, 0L);
      case 115:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x48000000000L, active1, 0L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x300000000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x40c000000L, active1, 0L);
      case 118:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000000L, active1, 0L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L, active1, 0L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L, active1, 0L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x20102000000000L, active1, 0L);
      case 124:
         if ((active1 & 0x10L) != 0L)
            return jjStopAtPos(1, 68);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, active1);
      return 2;
   }
   switch(curChar)
   {
      case 46:
         if ((active1 & 0x10000000L) != 0L)
            return jjStopAtPos(2, 92);
         break;
      case 61:
         if ((active1 & 0x8000L) != 0L)
            return jjStopAtPos(2, 79);
         else if ((active1 & 0x10000L) != 0L)
            return jjStopAtPos(2, 80);
         else if ((active1 & 0x20000000L) != 0L)
            return jjStopAtPos(2, 93);
         break;
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x80900000800L, active1, 0L);
      case 98:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         break;
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x4400000000000L, active1, 0L);
      case 100:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         break;
      case 101:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x108010000000100L, active1, 0L);
      case 102:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x10020000000000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0xc0008000L, active1, 0L);
      case 110:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000600L, active1, 0L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L, active1, 0L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x20002400080000L, active1, 0L);
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x80000200000000L, active1, 0L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x40204000001000L, active1, 0L);
      case 116:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x20804000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000002000L, active1, 0L);
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L, active1, 0L);
      case 120:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         break;
      case 121:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, active1);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(1, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x2004000000100L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 101:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         else if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x20000400004000L);
      case 102:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x40080800000000L);
      case 108:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x100020000000000L);
      case 109:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         break;
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000L);
      case 112:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         break;
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0xc010000000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x8200L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x80200100000c00L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x220000000L);
      case 118:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 100:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         break;
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         break;
      case 102:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000L);
      case 104:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000400L);
      case 107:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         break;
      case 108:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         break;
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000000L);
      case 111:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000000L);
      case 114:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x8200020004000L);
      case 116:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000000L);
      case 122:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x80200000000000L);
      case 99:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 1);
         break;
      case 101:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 1);
         else if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000000L);
      case 102:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000000L);
      case 110:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 1);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 116:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000000L);
      case 100:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 5, 1);
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000000000L);
      case 108:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 5, 1);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(7, 5, 1);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 5, 1);
         break;
      case 116:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 5, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(2);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\141\163", "\142\162\145\141\153", 
"\143\157\156\163\164", "\143\157\156\164\151\156\165\145", "\143\162\141\164\145", 
"\145\154\163\145", "\145\156\165\155", "\145\170\164\145\162\156", "\146\141\154\163\145", 
"\146\156", "\146\157\162", "\151\146", "\151\155\160\154", "\151\156", "\154\145\164", 
"\154\157\157\160", "\155\141\164\143\150", "\155\157\144", "\155\157\166\145", "\155\165\164", 
"\160\165\142", "\162\145\146", "\162\145\164\165\162\156", "\163\145\154\146", 
"\123\145\154\146", "\163\164\141\164\151\143", "\163\164\162\165\143\164", 
"\163\165\160\145\162", "\164\162\141\151\164", "\164\162\165\145", "\164\171\160\145", 
"\165\156\163\141\146\145", "\165\163\145", "\167\150\145\162\145", "\167\150\151\154\145", 
"\141\163\171\156\143", "\141\167\141\151\164", "\144\171\156", "\141\142\163\164\162\141\143\164", 
"\142\145\143\157\155\145", "\142\157\170", "\144\157", "\146\151\156\141\154", "\155\141\143\162\157", 
"\157\166\145\162\162\151\144\145", "\160\162\151\166", "\164\171\160\145\157\146", 
"\165\156\163\151\172\145\144", "\166\151\162\164\165\141\154", "\171\151\145\154\144", "\164\162\171", "\53", 
"\55", "\52", "\57", "\45", "\136", "\41", "\46", "\174", "\46\46", "\174\174", 
"\74\74", "\76\76", "\53\75", "\55\75", "\52\75", "\57\75", "\45\75", "\136\75", 
"\46\75", "\174\75", "\74\74\75", "\76\76\75", "\75", "\75\75", "\41\75", "\76", "\74", 
"\76\75", "\74\75", "\100", "\137", "\56", "\56\56", "\56\56\56", "\56\56\75", "\54", 
"\73", "\72", "\72\72", "\55\76", "\75\76", "\74\55", "\43", "\44", "\77", "\176", 
"\173", "\175", "\133", "\135", "\50", "\51", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffffffffe1L, 0x7fffffffffffL, 
};
static final long[] jjtoSkip = {
   0x1eL, 0x0L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[3];
static private final int[] jjstateSet = new int[6];
static protected char curChar;
/** Constructor. */
public LexerTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public LexerTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 3; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
