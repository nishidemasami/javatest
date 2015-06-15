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
		BASIC_LATIN,
		LATIN_1_SUPPLEMENT,
		LATIN_EXTENDED_A,
		LATIN_EXTENDED_B,
		IPA_EXTENSIONS,
		SPACING_MODIFIER_LETTERS,
		COMBINING_DIACRITICAL_MARKS,
		GREEK_AND_COPTIC,
		CYRILLIC,
		CYRILLIC_SUPPLEMENT,
		ARMENIAN,
		HEBREW,
		ARABIC,
		SYRIAC,
		ARABIC_SUPPLEMENT,
		THAANA,
		NKO,
		SAMARITAN,
		MANDAIC,
		ARABIC_EXTENDED_A,
		DEVANAGARI,
		BENGALI,
		GURMUKHI,
		GUJARATI,
		ORIYA,
		TAMIL,
		TELUGU,
		KANNADA,
		MALAYALAM,
		SINHALA,
		THAI,
		LAO,
		TIBETAN,
		MYANMAR,
		GEORGIAN,
		HANGUL_JAMO,
		ETHIOPIC,
		ETHIOPIC_SUPPLEMENT,
		CHEROKEE,
		UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS,
		OGHAM,
		RUNIC,
		TAGALOG,
		HANUNOO,
		BUHID,
		TAGBANWA,
		KHMER,
		MONGOLIAN,
		UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED,
		LIMBU,
		TAI_LE,
		NEW_TAI_LUE,
		KHMER_SYMBOLS,
		BUGINESE,
		TAI_THAM,
		COMBINING_DIACRITICAL_MARKS_EXTENDED,
		BALINESE,
		SUNDANESE,
		BATAK,
		LEPCHA,
		OL_CHIKI,
		SUNDANESE_SUPPLEMENT,
		VEDIC_EXTENSIONS,
		PHONETIC_EXTENSIONS,
		PHONETIC_EXTENSIONS_SUPPLEMENT,
		COMBINING_DIACRITICAL_MARKS_SUPPLEMENT,
		LATIN_EXTENDED_ADDITIONAL,
		GREEK_EXTENDED,
		GENERAL_PUNCTUATION,
		SUPERSCRIPTS_AND_SUBSCRIPTS,
		CURRENCY_SYMBOLS,
		COMBINING_DIACRITICAL_MARKS_FOR_SYMBOLS,
		LETTERLIKE_SYMBOLS,
		NUMBER_FORMS,
		ARROWS,
		MATHEMATICAL_OPERATORS,
		MISCELLANEOUS_TECHNICAL,
		CONTROL_PICTURES,
		OPTICAL_CHARACTER_RECOGNITION,
		ENCLOSED_ALPHANUMERICS,
		BOX_DRAWING,
		BLOCK_ELEMENTS,
		GEOMETRIC_SHAPES,
		MISCELLANEOUS_SYMBOLS,
		DINGBATS,
		MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A,
		SUPPLEMENTAL_ARROWS_A,
		BRAILLE_PATTERNS,
		SUPPLEMENTAL_ARROWS_B,
		MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B,
		SUPPLEMENTAL_MATHEMATICAL_OPERATORS,
		MISCELLANEOUS_SYMBOLS_AND_ARROWS,
		GLAGOLITIC,
		LATIN_EXTENDED_C,
		COPTIC,
		GEORGIAN_SUPPLEMENT,
		TIFINAGH,
		ETHIOPIC_EXTENDED,
		CYRILLIC_EXTENDED_A,
		SUPPLEMENTAL_PUNCTUATION,
		CJK_RADICALS_SUPPLEMENT,
		KANGXI_RADICALS,
		IDEOGRAPHIC_DESCRIPTION_CHARACTERS,
		CJK_SYMBOLS_AND_PUNCTUATION,
		HIRAGANA,
		KATAKANA,
		BOPOMOFO,
		HANGUL_COMPATIBILITY_JAMO,
		KANBUN,
		BOPOMOFO_EXTENDED,
		CJK_STROKES,
		KATAKANA_PHONETIC_EXTENSIONS,
		ENCLOSED_CJK_LETTERS_AND_MONTHS,
		CJK_COMPATIBILITY,
		CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A,
		YIJING_HEXAGRAM_SYMBOLS,
		CJK_UNIFIED_IDEOGRAPHS,
		YI_SYLLABLES,
		YI_RADICALS,
		LISU,
		VAI,
		CYRILLIC_EXTENDED_B,
		BAMUM,
		MODIFIER_TONE_LETTERS,
		LATIN_EXTENDED_D,
		SYLOTI_NAGRI,
		COMMON_INDIC_NUMBER_FORMS,
		PHAGS_PA,
		SAURASHTRA,
		DEVANAGARI_EXTENDED,
		KAYAH_LI,
		REJANG,
		HANGUL_JAMO_EXTENDED_A,
		JAVANESE,
		MYANMAR_EXTENDED_B,
		CHAM,
		MYANMAR_EXTENDED_A,
		TAI_VIET,
		MEETEI_MAYEK_EXTENSIONS,
		ETHIOPIC_EXTENDED_A,
		LATIN_EXTENDED_E,
		MEETEI_MAYEK,
		HANGUL_SYLLABLES,
		HANGUL_JAMO_EXTENDED_B,
		HIGH_SURROGATES,
		HIGH_PRIVATE_USE_SURROGATES,
		LOW_SURROGATES,
		PRIVATE_USE_AREA,
		CJK_COMPATIBILITY_IDEOGRAPHS,
		ALPHABETIC_PRESENTATION_FORMS,
		ARABIC_PRESENTATION_FORMS_A,
		VARIATION_SELECTORS,
		VERTICAL_FORMS,
		COMBINING_HALF_MARKS,
		CJK_COMPATIBILITY_FORMS,
		SMALL_FORM_VARIANTS,
		ARABIC_PRESENTATION_FORMS_B,
		HALFWIDTH_AND_FULLWIDTH_FORMS,
		SPECIALS;

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
