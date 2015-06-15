import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class VeryUsefulUtils {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		outputUTF8(System.out, (char) 0x2000, (char) 0x206f, false);
		outputUTF8(System.out, UNICODE_BLOCKS.GENERAL_PUNCTUATION, false);
	}

	static enum UNICODE_BLOCKS {
		BASIC_LATIN, //基本ラテン文字（ASCII互換）
		LATIN_1_SUPPLEMENT, //ラテン1補助
		LATIN_EXTENDED_A, //ラテン文字拡張A
		LATIN_EXTENDED_B, //ラテン文字拡張B
		IPA_EXTENSIONS, //IPA拡張（国際音声記号）
		SPACING_MODIFIER_LETTERS, //前進を伴う修飾文字
		COMBINING_DIACRITICAL_MARKS, //ダイアクリティカルマーク（合成可能）
		GREEK_AND_COPTIC, //ギリシア文字及びコプト文字
		CYRILLIC, //キリール文字（キリル文字）
		CYRILLIC_SUPPLEMENT, //キリール文字補助
		ARMENIAN, //アルメニア文字
		HEBREW, //ヘブライ文字
		ARABIC, //アラビア文字
		SYRIAC, //シリア文字
		ARABIC_SUPPLEMENT, //アラビア文字補助
		THAANA, //ターナ文字
		NKO, //ンコ文字
		SAMARITAN, //サマリア文字
		MANDAIC, //マンダ文字
		ARABIC_EXTENDED_A, //アラビア文字拡張A
		DEVANAGARI, //デーヴァナーガリー文字
		BENGALI, //ベンガル文字
		GURMUKHI, //グルムキー文字
		GUJARATI, //グジャラート文字（グジャラーティー文字）
		ORIYA, //オリヤー文字
		TAMIL, //タミル文字
		TELUGU, //テルグ文字
		KANNADA, //カンナダ文字
		MALAYALAM, //マラヤーラム文字
		SINHALA, //シンハラ文字
		THAI, //タイ文字
		LAO, //ラオス文字（ラーオ文字）
		TIBETAN, //チベット文字
		MYANMAR, //ミャンマー文字（ビルマ文字）
		GEORGIAN, //グルジア文字
		HANGUL_JAMO, //ハングル字母
		ETHIOPIC, //エチオピア文字（ゲエズ文字）
		ETHIOPIC_SUPPLEMENT, //エチオピア文字補助
		CHEROKEE, //チェロキー文字
		UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS, //統合カナダ先住民音節（カナダ先住民文字）
		OGHAM, //オガム文字
		RUNIC, //ルーン文字
		TAGALOG, //タガログ文字（バイバイン）
		HANUNOO, //ハヌノオ文字
		BUHID, //ブヒッド文字
		TAGBANWA, //タグバヌア文字（タグバヌワ文字）
		KHMER, //クメール文字
		MONGOLIAN, //モンゴル文字
		UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED, //統合カナダ先住民音節拡張
		LIMBU, //リンブ文字
		TAI_LE, //タイ・ロ文字
		NEW_TAI_LUE, //新タイ・ロ文字（西双版納タイ文字）
		KHMER_SYMBOLS, //クメール文字用記号
		BUGINESE, //ブギス文字（ロンタラ文字）
		TAI_THAM, //ラーンナー文字
		COMBINING_DIACRITICAL_MARKS_EXTENDED, //ダイアクリティカルマーク（合成可能）拡張
		BALINESE, //バリ文字
		SUNDANESE, //スンダ文字
		BATAK, //バタク文字
		LEPCHA, //レプチャ文字
		OL_CHIKI, //オル・チキ文字
		SUNDANESE_SUPPLEMENT, //スンダ文字補助
		VEDIC_EXTENSIONS, //ヴェーダ文字拡張
		PHONETIC_EXTENSIONS, //音声記号拡張
		PHONETIC_EXTENSIONS_SUPPLEMENT, //音声記号拡張補助
		COMBINING_DIACRITICAL_MARKS_SUPPLEMENT, //ダイアクリティカルマーク（合成可能）補助
		LATIN_EXTENDED_ADDITIONAL, //ラテン文字拡張追加
		GREEK_EXTENDED, //ギリシア文字拡張
		GENERAL_PUNCTUATION, //一般句読点
		SUPERSCRIPTS_AND_SUBSCRIPTS, //上付き・下付き
		CURRENCY_SYMBOLS, //通貨記号
		COMBINING_DIACRITICAL_MARKS_FOR_SYMBOLS, //記号用ダイアクリティカルマーク（合成可能）
		LETTERLIKE_SYMBOLS, //文字様記号
		NUMBER_FORMS, //数字に準じるもの
		ARROWS, //矢印
		MATHEMATICAL_OPERATORS, //数学記号
		MISCELLANEOUS_TECHNICAL, //その他の技術用記号
		CONTROL_PICTURES, //制御機能用記号
		OPTICAL_CHARACTER_RECOGNITION, //光学的文字認識、OCR
		ENCLOSED_ALPHANUMERICS, //囲み英数字
		BOX_DRAWING, //罫線素片
		BLOCK_ELEMENTS, //ブロック要素
		GEOMETRIC_SHAPES, //幾何学模様
		MISCELLANEOUS_SYMBOLS, //その他の記号
		DINGBATS, //装飾記号
		MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A, //その他の数学記号A
		SUPPLEMENTAL_ARROWS_A, //補助矢印A
		BRAILLE_PATTERNS, //点字図形
		SUPPLEMENTAL_ARROWS_B, //補助矢印B
		MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B, //その他の数学記号B
		SUPPLEMENTAL_MATHEMATICAL_OPERATORS, //補助数学記号
		MISCELLANEOUS_SYMBOLS_AND_ARROWS, //その他の記号及び矢印
		GLAGOLITIC, //グラゴル文字
		LATIN_EXTENDED_C, //ラテン文字拡張C
		COPTIC, //コプト文字
		GEORGIAN_SUPPLEMENT, //グルジア文字補助
		TIFINAGH, //ティフナグ文字
		ETHIOPIC_EXTENDED, //エチオピア文字拡張
		CYRILLIC_EXTENDED_A, //キリール文字拡張A
		SUPPLEMENTAL_PUNCTUATION, //補助句読点
		CJK_RADICALS_SUPPLEMENT, //CJK部首補助
		KANGXI_RADICALS, //康熙部首
		IDEOGRAPHIC_DESCRIPTION_CHARACTERS, //漢字構成記述文字、IDC
		CJK_SYMBOLS_AND_PUNCTUATION, //CJKの記号及び句読点
		HIRAGANA, //平仮名
		KATAKANA, //片仮名
		BOPOMOFO, //注音字母（注音符号）
		HANGUL_COMPATIBILITY_JAMO, //ハングル互換字母
		KANBUN, //漢文用記号（返り点）
		BOPOMOFO_EXTENDED, //注音字母拡張
		CJK_STROKES, //CJKの筆画
		KATAKANA_PHONETIC_EXTENSIONS, //片仮名拡張
		ENCLOSED_CJK_LETTERS_AND_MONTHS, //囲みCJK文字・月
		CJK_COMPATIBILITY, //CJK互換用文字
		CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, //CJK統合漢字拡張A
		YIJING_HEXAGRAM_SYMBOLS, //易経記号（六十四卦）
		CJK_UNIFIED_IDEOGRAPHS, //CJK統合漢字
		YI_SYLLABLES, //イ文字（ロロ文字）
		YI_RADICALS, //イ文字部首
		LISU, //リス文字
		VAI, //ヴァイ文字
		CYRILLIC_EXTENDED_B, //キリール文字拡張B
		BAMUM, //バムン文字
		MODIFIER_TONE_LETTERS, //声調修飾文字
		LATIN_EXTENDED_D, //ラテン文字拡張D
		SYLOTI_NAGRI, //シロティ・ナグリ文字
		COMMON_INDIC_NUMBER_FORMS, //共通インド数字に準じるもの
		PHAGS_PA, //パスパ文字
		SAURASHTRA, //サウラーシュトラ文字
		DEVANAGARI_EXTENDED, //デーヴァナーガリー文字拡張
		KAYAH_LI, //カヤー文字
		REJANG, //レジャン文字
		HANGUL_JAMO_EXTENDED_A, //ハングル字母拡張A
		JAVANESE, //ジャワ文字
		MYANMAR_EXTENDED_B, //ミャンマー文字拡張B
		CHAM, //チャム文字
		MYANMAR_EXTENDED_A, //ミャンマー文字拡張A
		TAI_VIET, //タイ・ヴェト文字
		MEETEI_MAYEK_EXTENSIONS, //マニプリ文字拡張
		ETHIOPIC_EXTENDED_A, //エチオピア文字拡張A
		LATIN_EXTENDED_E, //ラテン文字拡張E
		MEETEI_MAYEK, //マニプリ文字
		HANGUL_SYLLABLES, //ハングル音節文字
		HANGUL_JAMO_EXTENDED_B, //ハングル字母拡張B
		HIGH_SURROGATES, //上位代用符号位置
		HIGH_PRIVATE_USE_SURROGATES, //上位私用代用符号位置
		LOW_SURROGATES, //下位代用符号位置
		PRIVATE_USE_AREA, //私用領域（外字領域）
		CJK_COMPATIBILITY_IDEOGRAPHS, //CJK互換漢字
		ALPHABETIC_PRESENTATION_FORMS, //アルファベット表示形
		ARABIC_PRESENTATION_FORMS_A, //アラビア表示形A
		VARIATION_SELECTORS, //字形選択子（異体字セレクタ）
		VERTICAL_FORMS, //縦書き形
		COMBINING_HALF_MARKS, //半記号（合成可能）
		CJK_COMPATIBILITY_FORMS, //CJK互換形
		SMALL_FORM_VARIANTS, //小字形
		ARABIC_PRESENTATION_FORMS_B, //アラビア表示形B
		HALFWIDTH_AND_FULLWIDTH_FORMS, //半角・全角形
		SPECIALS, //特殊用途文字
		;

		public char getStart() {
			switch (this) {
			case BASIC_LATIN:
				return (char) 0x0000;
			case LATIN_1_SUPPLEMENT:
				return (char) 0x0080;
			case LATIN_EXTENDED_A:
				return (char) 0x0100;
			case LATIN_EXTENDED_B:
				return (char) 0x0180;
			case IPA_EXTENSIONS:
				return (char) 0x0250;
			case SPACING_MODIFIER_LETTERS:
				return (char) 0x02B0;
			case COMBINING_DIACRITICAL_MARKS:
				return (char) 0x0300;
			case GREEK_AND_COPTIC:
				return (char) 0x0370;
			case CYRILLIC:
				return (char) 0x0400;
			case CYRILLIC_SUPPLEMENT:
				return (char) 0x0500;
			case ARMENIAN:
				return (char) 0x0530;
			case HEBREW:
				return (char) 0x0590;
			case ARABIC:
				return (char) 0x0600;
			case SYRIAC:
				return (char) 0x0700;
			case ARABIC_SUPPLEMENT:
				return (char) 0x0750;
			case THAANA:
				return (char) 0x0780;
			case NKO:
				return (char) 0x07C0;
			case SAMARITAN:
				return (char) 0x0800;
			case MANDAIC:
				return (char) 0x0840;
			case ARABIC_EXTENDED_A:
				return (char) 0x08A0;
			case DEVANAGARI:
				return (char) 0x0900;
			case BENGALI:
				return (char) 0x0980;
			case GURMUKHI:
				return (char) 0x0A00;
			case GUJARATI:
				return (char) 0x0A80;
			case ORIYA:
				return (char) 0x0B00;
			case TAMIL:
				return (char) 0x0B80;
			case TELUGU:
				return (char) 0x0C00;
			case KANNADA:
				return (char) 0x0C80;
			case MALAYALAM:
				return (char) 0x0D00;
			case SINHALA:
				return (char) 0x0D80;
			case THAI:
				return (char) 0x0E00;
			case LAO:
				return (char) 0x0E80;
			case TIBETAN:
				return (char) 0x0F00;
			case MYANMAR:
				return (char) 0x1000;
			case GEORGIAN:
				return (char) 0x10A0;
			case HANGUL_JAMO:
				return (char) 0x1100;
			case ETHIOPIC:
				return (char) 0x1200;
			case ETHIOPIC_SUPPLEMENT:
				return (char) 0x1380;
			case CHEROKEE:
				return (char) 0x13A0;
			case UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS:
				return (char) 0x1400;
			case OGHAM:
				return (char) 0x1680;
			case RUNIC:
				return (char) 0x16A0;
			case TAGALOG:
				return (char) 0x1700;
			case HANUNOO:
				return (char) 0x1720;
			case BUHID:
				return (char) 0x1740;
			case TAGBANWA:
				return (char) 0x1760;
			case KHMER:
				return (char) 0x1780;
			case MONGOLIAN:
				return (char) 0x1800;
			case UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED:
				return (char) 0x18B0;
			case LIMBU:
				return (char) 0x1900;
			case TAI_LE:
				return (char) 0x1950;
			case NEW_TAI_LUE:
				return (char) 0x1980;
			case KHMER_SYMBOLS:
				return (char) 0x19E0;
			case BUGINESE:
				return (char) 0x1A00;
			case TAI_THAM:
				return (char) 0x1A20;
			case COMBINING_DIACRITICAL_MARKS_EXTENDED:
				return (char) 0x1AB0;
			case BALINESE:
				return (char) 0x1B00;
			case SUNDANESE:
				return (char) 0x1B80;
			case BATAK:
				return (char) 0x1BC0;
			case LEPCHA:
				return (char) 0x1C00;
			case OL_CHIKI:
				return (char) 0x1C50;
			case SUNDANESE_SUPPLEMENT:
				return (char) 0x1CC0;
			case VEDIC_EXTENSIONS:
				return (char) 0x1CD0;
			case PHONETIC_EXTENSIONS:
				return (char) 0x1D00;
			case PHONETIC_EXTENSIONS_SUPPLEMENT:
				return (char) 0x1D80;
			case COMBINING_DIACRITICAL_MARKS_SUPPLEMENT:
				return (char) 0x1DC0;
			case LATIN_EXTENDED_ADDITIONAL:
				return (char) 0x1E00;
			case GREEK_EXTENDED:
				return (char) 0x1F00;
			case GENERAL_PUNCTUATION:
				return (char) 0x2000;
			case SUPERSCRIPTS_AND_SUBSCRIPTS:
				return (char) 0x2070;
			case CURRENCY_SYMBOLS:
				return (char) 0x20A0;
			case COMBINING_DIACRITICAL_MARKS_FOR_SYMBOLS:
				return (char) 0x20D0;
			case LETTERLIKE_SYMBOLS:
				return (char) 0x2100;
			case NUMBER_FORMS:
				return (char) 0x2150;
			case ARROWS:
				return (char) 0x2190;
			case MATHEMATICAL_OPERATORS:
				return (char) 0x2200;
			case MISCELLANEOUS_TECHNICAL:
				return (char) 0x2300;
			case CONTROL_PICTURES:
				return (char) 0x2400;
			case OPTICAL_CHARACTER_RECOGNITION:
				return (char) 0x2440;
			case ENCLOSED_ALPHANUMERICS:
				return (char) 0x2460;
			case BOX_DRAWING:
				return (char) 0x2500;
			case BLOCK_ELEMENTS:
				return (char) 0x2580;
			case GEOMETRIC_SHAPES:
				return (char) 0x25A0;
			case MISCELLANEOUS_SYMBOLS:
				return (char) 0x2600;
			case DINGBATS:
				return (char) 0x2700;
			case MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A:
				return (char) 0x27C0;
			case SUPPLEMENTAL_ARROWS_A:
				return (char) 0x27F0;
			case BRAILLE_PATTERNS:
				return (char) 0x2800;
			case SUPPLEMENTAL_ARROWS_B:
				return (char) 0x2900;
			case MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B:
				return (char) 0x2980;
			case SUPPLEMENTAL_MATHEMATICAL_OPERATORS:
				return (char) 0x2A00;
			case MISCELLANEOUS_SYMBOLS_AND_ARROWS:
				return (char) 0x2B00;
			case GLAGOLITIC:
				return (char) 0x2C00;
			case LATIN_EXTENDED_C:
				return (char) 0x2C60;
			case COPTIC:
				return (char) 0x2C80;
			case GEORGIAN_SUPPLEMENT:
				return (char) 0x2D00;
			case TIFINAGH:
				return (char) 0x2D30;
			case ETHIOPIC_EXTENDED:
				return (char) 0x2D80;
			case CYRILLIC_EXTENDED_A:
				return (char) 0x2DE0;
			case SUPPLEMENTAL_PUNCTUATION:
				return (char) 0x2E00;
			case CJK_RADICALS_SUPPLEMENT:
				return (char) 0x2E80;
			case KANGXI_RADICALS:
				return (char) 0x2F00;
			case IDEOGRAPHIC_DESCRIPTION_CHARACTERS:
				return (char) 0x2FF0;
			case CJK_SYMBOLS_AND_PUNCTUATION:
				return (char) 0x3000;
			case HIRAGANA:
				return (char) 0x3040;
			case KATAKANA:
				return (char) 0x30A0;
			case BOPOMOFO:
				return (char) 0x3100;
			case HANGUL_COMPATIBILITY_JAMO:
				return (char) 0x3130;
			case KANBUN:
				return (char) 0x3190;
			case BOPOMOFO_EXTENDED:
				return (char) 0x31A0;
			case CJK_STROKES:
				return (char) 0x31C0;
			case KATAKANA_PHONETIC_EXTENSIONS:
				return (char) 0x31F0;
			case ENCLOSED_CJK_LETTERS_AND_MONTHS:
				return (char) 0x3200;
			case CJK_COMPATIBILITY:
				return (char) 0x3300;
			case CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A:
				return (char) 0x3400;
			case YIJING_HEXAGRAM_SYMBOLS:
				return (char) 0x4DC0;
			case CJK_UNIFIED_IDEOGRAPHS:
				return (char) 0x4E00;
			case YI_SYLLABLES:
				return (char) 0xA000;
			case YI_RADICALS:
				return (char) 0xA490;
			case LISU:
				return (char) 0xA4D0;
			case VAI:
				return (char) 0xA500;
			case CYRILLIC_EXTENDED_B:
				return (char) 0xA640;
			case BAMUM:
				return (char) 0xA6A0;
			case MODIFIER_TONE_LETTERS:
				return (char) 0xA700;
			case LATIN_EXTENDED_D:
				return (char) 0xA720;
			case SYLOTI_NAGRI:
				return (char) 0xA800;
			case COMMON_INDIC_NUMBER_FORMS:
				return (char) 0xA830;
			case PHAGS_PA:
				return (char) 0xA840;
			case SAURASHTRA:
				return (char) 0xA880;
			case DEVANAGARI_EXTENDED:
				return (char) 0xA8E0;
			case KAYAH_LI:
				return (char) 0xA900;
			case REJANG:
				return (char) 0xA930;
			case HANGUL_JAMO_EXTENDED_A:
				return (char) 0xA960;
			case JAVANESE:
				return (char) 0xA980;
			case MYANMAR_EXTENDED_B:
				return (char) 0xA9E0;
			case CHAM:
				return (char) 0xAA00;
			case MYANMAR_EXTENDED_A:
				return (char) 0xAA60;
			case TAI_VIET:
				return (char) 0xAA80;
			case MEETEI_MAYEK_EXTENSIONS:
				return (char) 0xAAE0;
			case ETHIOPIC_EXTENDED_A:
				return (char) 0xAB00;
			case LATIN_EXTENDED_E:
				return (char) 0xAB30;
			case MEETEI_MAYEK:
				return (char) 0xABC0;
			case HANGUL_SYLLABLES:
				return (char) 0xAC00;
			case HANGUL_JAMO_EXTENDED_B:
				return (char) 0xD7B0;
			case HIGH_SURROGATES:
				return (char) 0xD800;
			case HIGH_PRIVATE_USE_SURROGATES:
				return (char) 0xDB80;
			case LOW_SURROGATES:
				return (char) 0xDC00;
			case PRIVATE_USE_AREA:
				return (char) 0xE000;
			case CJK_COMPATIBILITY_IDEOGRAPHS:
				return (char) 0xF900;
			case ALPHABETIC_PRESENTATION_FORMS:
				return (char) 0xFB00;
			case ARABIC_PRESENTATION_FORMS_A:
				return (char) 0xFB50;
			case VARIATION_SELECTORS:
				return (char) 0xFE00;
			case VERTICAL_FORMS:
				return (char) 0xFE10;
			case COMBINING_HALF_MARKS:
				return (char) 0xFE20;
			case CJK_COMPATIBILITY_FORMS:
				return (char) 0xFE30;
			case SMALL_FORM_VARIANTS:
				return (char) 0xFE50;
			case ARABIC_PRESENTATION_FORMS_B:
				return (char) 0xFE70;
			case HALFWIDTH_AND_FULLWIDTH_FORMS:
				return (char) 0xFF00;
			case SPECIALS:
				return (char) 0xFFF0;
			default:
				throw new InternalError();
			}
		}

		public char getEnd() {

			switch (this) {
			case BASIC_LATIN:
				return (char) 0x007F;
			case LATIN_1_SUPPLEMENT:
				return (char) 0x00FF;
			case LATIN_EXTENDED_A:
				return (char) 0x017F;
			case LATIN_EXTENDED_B:
				return (char) 0x024F;
			case IPA_EXTENSIONS:
				return (char) 0x02AF;
			case SPACING_MODIFIER_LETTERS:
				return (char) 0x02FF;
			case COMBINING_DIACRITICAL_MARKS:
				return (char) 0x036F;
			case GREEK_AND_COPTIC:
				return (char) 0x03FF;
			case CYRILLIC:
				return (char) 0x04FF;
			case CYRILLIC_SUPPLEMENT:
				return (char) 0x052F;
			case ARMENIAN:
				return (char) 0x058F;
			case HEBREW:
				return (char) 0x05FF;
			case ARABIC:
				return (char) 0x06FF;
			case SYRIAC:
				return (char) 0x074F;
			case ARABIC_SUPPLEMENT:
				return (char) 0x077F;
			case THAANA:
				return (char) 0x07BF;
			case NKO:
				return (char) 0x07FF;
			case SAMARITAN:
				return (char) 0x083F;
			case MANDAIC:
				return (char) 0x085F;
			case ARABIC_EXTENDED_A:
				return (char) 0x08FF;
			case DEVANAGARI:
				return (char) 0x097F;
			case BENGALI:
				return (char) 0x09FF;
			case GURMUKHI:
				return (char) 0x0A7F;
			case GUJARATI:
				return (char) 0x0AFF;
			case ORIYA:
				return (char) 0x0B7F;
			case TAMIL:
				return (char) 0x0BFF;
			case TELUGU:
				return (char) 0x0C7F;
			case KANNADA:
				return (char) 0x0CFF;
			case MALAYALAM:
				return (char) 0x0D7F;
			case SINHALA:
				return (char) 0x0DFF;
			case THAI:
				return (char) 0x0E7F;
			case LAO:
				return (char) 0x0EFF;
			case TIBETAN:
				return (char) 0x0FFF;
			case MYANMAR:
				return (char) 0x109F;
			case GEORGIAN:
				return (char) 0x10FF;
			case HANGUL_JAMO:
				return (char) 0x11FF;
			case ETHIOPIC:
				return (char) 0x137F;
			case ETHIOPIC_SUPPLEMENT:
				return (char) 0x139F;
			case CHEROKEE:
				return (char) 0x13FF;
			case UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS:
				return (char) 0x167F;
			case OGHAM:
				return (char) 0x169F;
			case RUNIC:
				return (char) 0x16FF;
			case TAGALOG:
				return (char) 0x171F;
			case HANUNOO:
				return (char) 0x173F;
			case BUHID:
				return (char) 0x175F;
			case TAGBANWA:
				return (char) 0x177F;
			case KHMER:
				return (char) 0x17FF;
			case MONGOLIAN:
				return (char) 0x18AF;
			case UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED:
				return (char) 0x18FF;
			case LIMBU:
				return (char) 0x194F;
			case TAI_LE:
				return (char) 0x197F;
			case NEW_TAI_LUE:
				return (char) 0x19DF;
			case KHMER_SYMBOLS:
				return (char) 0x19FF;
			case BUGINESE:
				return (char) 0x1A1F;
			case TAI_THAM:
				return (char) 0x1AAF;
			case COMBINING_DIACRITICAL_MARKS_EXTENDED:
				return (char) 0x1AFF;
			case BALINESE:
				return (char) 0x1B7F;
			case SUNDANESE:
				return (char) 0x1BBF;
			case BATAK:
				return (char) 0x1BFF;
			case LEPCHA:
				return (char) 0x1C4F;
			case OL_CHIKI:
				return (char) 0x1C7F;
			case SUNDANESE_SUPPLEMENT:
				return (char) 0x1CCF;
			case VEDIC_EXTENSIONS:
				return (char) 0x1CFF;
			case PHONETIC_EXTENSIONS:
				return (char) 0x1D7F;
			case PHONETIC_EXTENSIONS_SUPPLEMENT:
				return (char) 0x1DBF;
			case COMBINING_DIACRITICAL_MARKS_SUPPLEMENT:
				return (char) 0x1DFF;
			case LATIN_EXTENDED_ADDITIONAL:
				return (char) 0x1EFF;
			case GREEK_EXTENDED:
				return (char) 0x1FFF;
			case GENERAL_PUNCTUATION:
				return (char) 0x206F;
			case SUPERSCRIPTS_AND_SUBSCRIPTS:
				return (char) 0x209F;
			case CURRENCY_SYMBOLS:
				return (char) 0x20CF;
			case COMBINING_DIACRITICAL_MARKS_FOR_SYMBOLS:
				return (char) 0x20FF;
			case LETTERLIKE_SYMBOLS:
				return (char) 0x214F;
			case NUMBER_FORMS:
				return (char) 0x218F;
			case ARROWS:
				return (char) 0x21FF;
			case MATHEMATICAL_OPERATORS:
				return (char) 0x22FF;
			case MISCELLANEOUS_TECHNICAL:
				return (char) 0x23FF;
			case CONTROL_PICTURES:
				return (char) 0x243F;
			case OPTICAL_CHARACTER_RECOGNITION:
				return (char) 0x245F;
			case ENCLOSED_ALPHANUMERICS:
				return (char) 0x24FF;
			case BOX_DRAWING:
				return (char) 0x257F;
			case BLOCK_ELEMENTS:
				return (char) 0x259F;
			case GEOMETRIC_SHAPES:
				return (char) 0x25FF;
			case MISCELLANEOUS_SYMBOLS:
				return (char) 0x26FF;
			case DINGBATS:
				return (char) 0x27BF;
			case MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A:
				return (char) 0x27EF;
			case SUPPLEMENTAL_ARROWS_A:
				return (char) 0x27FF;
			case BRAILLE_PATTERNS:
				return (char) 0x28FF;
			case SUPPLEMENTAL_ARROWS_B:
				return (char) 0x297F;
			case MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B:
				return (char) 0x29FF;
			case SUPPLEMENTAL_MATHEMATICAL_OPERATORS:
				return (char) 0x2AFF;
			case MISCELLANEOUS_SYMBOLS_AND_ARROWS:
				return (char) 0x2BFF;
			case GLAGOLITIC:
				return (char) 0x2C5F;
			case LATIN_EXTENDED_C:
				return (char) 0x2C7F;
			case COPTIC:
				return (char) 0x2CFF;
			case GEORGIAN_SUPPLEMENT:
				return (char) 0x2D2F;
			case TIFINAGH:
				return (char) 0x2D7F;
			case ETHIOPIC_EXTENDED:
				return (char) 0x2DDF;
			case CYRILLIC_EXTENDED_A:
				return (char) 0x2DFF;
			case SUPPLEMENTAL_PUNCTUATION:
				return (char) 0x2E7F;
			case CJK_RADICALS_SUPPLEMENT:
				return (char) 0x2EFF;
			case KANGXI_RADICALS:
				return (char) 0x2FDF;
			case IDEOGRAPHIC_DESCRIPTION_CHARACTERS:
				return (char) 0x2FFF;
			case CJK_SYMBOLS_AND_PUNCTUATION:
				return (char) 0x303F;
			case HIRAGANA:
				return (char) 0x309F;
			case KATAKANA:
				return (char) 0x30FF;
			case BOPOMOFO:
				return (char) 0x312F;
			case HANGUL_COMPATIBILITY_JAMO:
				return (char) 0x318F;
			case KANBUN:
				return (char) 0x319F;
			case BOPOMOFO_EXTENDED:
				return (char) 0x31BF;
			case CJK_STROKES:
				return (char) 0x31EF;
			case KATAKANA_PHONETIC_EXTENSIONS:
				return (char) 0x31FF;
			case ENCLOSED_CJK_LETTERS_AND_MONTHS:
				return (char) 0x32FF;
			case CJK_COMPATIBILITY:
				return (char) 0x33FF;
			case CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A:
				return (char) 0x4DBF;
			case YIJING_HEXAGRAM_SYMBOLS:
				return (char) 0x4DFF;
			case CJK_UNIFIED_IDEOGRAPHS:
				return (char) 0x9FFF;
			case YI_SYLLABLES:
				return (char) 0xA48F;
			case YI_RADICALS:
				return (char) 0xA4CF;
			case LISU:
				return (char) 0xA4FF;
			case VAI:
				return (char) 0xA63F;
			case CYRILLIC_EXTENDED_B:
				return (char) 0xA69F;
			case BAMUM:
				return (char) 0xA6FF;
			case MODIFIER_TONE_LETTERS:
				return (char) 0xA71F;
			case LATIN_EXTENDED_D:
				return (char) 0xA7FF;
			case SYLOTI_NAGRI:
				return (char) 0xA82F;
			case COMMON_INDIC_NUMBER_FORMS:
				return (char) 0xA83F;
			case PHAGS_PA:
				return (char) 0xA87F;
			case SAURASHTRA:
				return (char) 0xA8DF;
			case DEVANAGARI_EXTENDED:
				return (char) 0xA8FF;
			case KAYAH_LI:
				return (char) 0xA92F;
			case REJANG:
				return (char) 0xA95F;
			case HANGUL_JAMO_EXTENDED_A:
				return (char) 0xA97F;
			case JAVANESE:
				return (char) 0xA9DF;
			case MYANMAR_EXTENDED_B:
				return (char) 0xA9FF;
			case CHAM:
				return (char) 0xAA5F;
			case MYANMAR_EXTENDED_A:
				return (char) 0xAA7F;
			case TAI_VIET:
				return (char) 0xAADF;
			case MEETEI_MAYEK_EXTENSIONS:
				return (char) 0xAAFF;
			case ETHIOPIC_EXTENDED_A:
				return (char) 0xAB2F;
			case LATIN_EXTENDED_E:
				return (char) 0xAB6F;
			case MEETEI_MAYEK:
				return (char) 0xABFF;
			case HANGUL_SYLLABLES:
				return (char) 0xD7AF;
			case HANGUL_JAMO_EXTENDED_B:
				return (char) 0xD7FF;
			case HIGH_SURROGATES:
				return (char) 0xDB7F;
			case HIGH_PRIVATE_USE_SURROGATES:
				return (char) 0xDBFF;
			case LOW_SURROGATES:
				return (char) 0xDFFF;
			case PRIVATE_USE_AREA:
				return (char) 0xF8FF;
			case CJK_COMPATIBILITY_IDEOGRAPHS:
				return (char) 0xFAFF;
			case ALPHABETIC_PRESENTATION_FORMS:
				return (char) 0xFB4F;
			case ARABIC_PRESENTATION_FORMS_A:
				return (char) 0xFDFF;
			case VARIATION_SELECTORS:
				return (char) 0xFE0F;
			case VERTICAL_FORMS:
				return (char) 0xFE1F;
			case COMBINING_HALF_MARKS:
				return (char) 0xFE2F;
			case CJK_COMPATIBILITY_FORMS:
				return (char) 0xFE4F;
			case SMALL_FORM_VARIANTS:
				return (char) 0xFE6F;
			case ARABIC_PRESENTATION_FORMS_B:
				return (char) 0xFEFF;
			case HALFWIDTH_AND_FULLWIDTH_FORMS:
				return (char) 0xFFEF;
			case SPECIALS:
				return (char) 0xFFFF;
			default:
				throw new InternalError();
			}
		}
	}

	static void outputUTF8(PrintStream outputPrintStream, UNICODE_BLOCKS unicodeBlocks, boolean simpleOutput) {
		outputUTF8(outputPrintStream, unicodeBlocks.getStart(), unicodeBlocks.getEnd(), simpleOutput);
	}

	static void outputUTF8(PrintStream outputPrintStream, char start, char end, boolean simpleOutput) {

		for (char characterCode = start; characterCode <= end; ++characterCode) {

			if (!simpleOutput && (characterCode % 16 == 0 || characterCode == start)) {
				outputPrintStream.print("U+" + Integer.toHexString(characterCode));
			}

			if (!simpleOutput) {
				outputPrintStream.print(" ");
			}
			outputPrintStream.print(characterCode);

			if ((characterCode + 1) % 16 == 0) {
				outputPrintStream.println();
			}
		}
	}

	static BigInteger fact(int n) {
		if (n <= 1) {
			return (BigInteger.ONE);
		}
		return fact(n - 1).multiply(BigInteger.valueOf(n));
	}

	static BigInteger fact(final BigInteger n) {
		if (n.compareTo(BigInteger.ONE) <= 0) {
			return (BigInteger.ONE);
		}
		return fact(n.subtract(BigInteger.ONE)).multiply(n);
	}

	public static final double calcBirthdayProbrem(int numberOfPeople) {
		if (numberOfPeople == 1) {
			return (364d / 365d);
		} else if (numberOfPeople <= 0) {
			throw new InternalError();
		} else if (365 <= numberOfPeople) {
			throw new InternalError();
		} else {
			return (((double) (365 - numberOfPeople)) / 365d) * calcBirthdayProbrem(numberOfPeople - 1);
		}
	}
}
