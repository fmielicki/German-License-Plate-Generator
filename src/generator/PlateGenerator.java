package generator;
import java.util.Scanner;
import java.util.Random;

public class PlateGenerator {

    public static void main(String[] args) {
        System.out.println(GenerateCity() + "-" + GenerateUniqueIdentifier() + " " + EndNumber() + PlugInVehicle());
        DoAgain();
    }

    public static String GenerateCity() {
        String[] cityIdentifier = {"A", "AA", "AB", "ABG", "ABI", "AC", "AD", "AE", "AF", "AH", "AIB", "AIC", "AK", "AL", "ALF", "ALS", "ALZ", "AM", "AN", "ANA", "ANG", "ANK", "AÖ", "AP", "APD", "AR", "ARN", "ART", "AS", "ASD", "ASL", "ASZ", "AT", "AU", "AUR", "AW", "AZ", "AZE", "B", "BA", "BAD", "BAR", "BB", "BBG", "BC", "BCH", "BE", "BED", "BEI", "BEL", "BER", "BF", "BGD", "BGL", "BH", "BI", "BID", "BIN", "BIR", "BIT", "BIW", "BK", "BK", "BKS", "BL", "BLB", "BLK", "BM", "BN", "BNA", "BÖ", "BO", "BOG", "BOH", "BOR", "BOT", "BR", "BRA", "BRB", "BRG", "BRI", "BRK", "BRL", "BRV", "BS", "BSB", "BSK", "BT", "BTF", "BU", "BÜD", "BUL", "BÜR", "BÜS", "BÜZ", "BZ", "BZA", "C", "CA", "CAS", "CB", "CE", "CHA", "CLP", "CLZ", "CO", "COC", "COE", "CR", "CUX", "CW", "D", "DA", "DAH", "DAN", "DAU", "DBR", "DD", "DE", "DEG", "DEL", "DGF", "DH", "DI", "DIL", "DIN", "DIZ", "DKB", "DL", "DLG", "DM", "DN", "DO", "DON", "DS", "DT", "DU", "DUD", "DÜW", "DW", "DZ", "E", "EA", "EB", "EBE", "EBN", "EBS", "ECK", "ED", "EE", "EF", "EG", "EH", "EHI", "EI", "EIC", "EIH", "EIL", "EIN", "EIS", "EL", "EM", "EMD", "EMS", "EN", "ER", "ERB", "ERH", "ERK", "ERZ", "ES", "ESA", "ESB", "ESW", "EU", "EUT", "EW", "F", "FAL", "FB", "FD", "FDB", "FDS", "FEU", "FF", "FFB", "FG", "FH", "FI", "FKB", "FL", "FLÖ", "FN", "FO", "FOR", "FR", "FRG", "FRI", "FRW", "FS", "FT", "FTL", "FÜ", "FÜS", "FW", "FZ", "G", "GA", "GAN", "GAP", "GC", "GD", "GDB", "GE", "GEL", "GEM", "GEO", "GER", "GF", "GG", "GHA", "GHC", "GI", "GK", "GL", "GLA", "GM", "GMN", "GN", "GNT", "GÖ", "GOA", "GOH", "GP", "GR", "GRA", "GRH", "GRI", "GRM", "GRS", "GRZ", "GS", "GT", "GTH", "GÜ", "GUB", "GUN", "GV", "GVM", "GW", "GZ", "H", "HA", "HAB", "HAL", "HAM", "HAS", "HB", "HBN", "HBS", "HC", "HCH", "HD", "HDH", "HDL", "HE", "HEB", "HEF", "HEI", "HER", "HET", "HF", "HG", "HGN", "HGW", "HH", "HHM", "HI", "HIG", "HIP", "HK", "HK", "HL", "HM", "HMÜ", "HN", "HO", "HOG", "HOH", "HOL", "HOM", "HOR", "HÖS", "HOT", "HP", "HR", "HRO", "HS", "HSK", "HST", "HU", "HÜN", "HUS", "HV", "HVL", "HW", "HWI", "HX", "HY", "HZ", "HZ", "IGB", "IF", "IK", "IL", "ILL", "IN", "IS", "IZ", "J", "JB", "JE", "JEV", "JL", "JÜL", "K", "KA", "KAR", "KB", "KC", "KE", "KEH", "KEL", "KEM", "KF", "KG", "KH", "KI", "KIB", "KK", "KL", "KLE", "KLZ", "KM", "KN", "KO", "KÖN", "KÖT", "KÖZ", "KR", "KRU", "KS", "KT", "KU", "KÜN", "KUS", "KW", "KY", "KYF", "L", "L", "LA", "LAN", "LAU", "LAT", "LB", "LBS", "LBZ", "LC", "LD", "LDK", "LDS", "LE", "LEO", "LER", "LEV", "LF", "LG", "LH", "LI", "LIB", "LIF", "LIN", "LIP", "LK", "LL", "LM", "LN", "LÖ", "LÖB", "LOH", "LOS", "LP", "LR", "LRO", "LS", "LSZ", "LU", "LUP", "LÜD", "LUK", "LÜN", "LWL", "M", "MA", "MAB", "MAI", "MAK", "MAL", "MAR", "MB", "MC", "MD", "ME", "MED", "MEG", "MEI", "MEK", "MEL", "MEP", "MER", "MES", "MET", "MG", "MGH", "MGN", "MH", "MHL", "MI", "MIL", "MK", "MKK", "ML", "MM", "MN", "MO", "MOD", "MOL", "MON", "MOS", "MQ", "MR", "MS", "MSE", "MSH", "MSP", "MST", "MT", "MTK", "MTL", "MÜ", "MÜB", "MÜL", "MÜN", "MÜR", "MW", "MY", "MYK", "MZ", "MZG", "N", "NAB", "NAI", "NAU", "NB", "ND", "NDH", "NE", "NEA", "NEB", "NEC", "NEN", "NES", "NEU", "NEW", "NF", "NH", "NI", "NIB", "NK", "NM", "NMB", "NMS", "NÖ", "NOH", "NOL", "NOM", "NOR", "NP", "NR", "NRÜ", "NT", "NU", "NVP", "NW", "NWM", "NY", "NZ", "OA", "OAL", "OB", "OBB", "OBG", "OC", "OCH", "OD", "OE", "OF", "OG", "ÖHR", "OH", "OHA", "OHV", "OHZ", "OK", "OL", "OLD", "OP", "OPR", "OR", "OS", "OSL", "OTT", "OTW", "OVI", "OVL", "OVP", "OZ", "P", "PA", "PAF", "PAN", "PAR", "PB", "PCH", "PE", "PEG", "PER", "PF", "PI", "PIR", "PK", "PL", "PLÖ", "PM", "PN", "PR", "PRÜ", "PS", "PW", "PZ", "QFT", "QLB", "R", "RA", "RC", "RD", "RDG", "RE", "REG", "REH", "REI", "RG", "RH", "RI", "RID", "RIE", "RL", "RM", "RN", "RO", "ROD", "ROF", "ROH", "ROK", "ROL", "ROS", "ROT", "ROW", "RP", "RS", "RSL", "RT", "RÜD", "RU", "RÜG", "RV", "RW", "RY", "RZ", "S", "SAB", "SAD", "SÄK", "SAN", "SAW", "SB", "SBG", "SBK", "SC", "SCZ", "SDH", "SDL", "SDT", "SE", "SEB", "SEE", "SEF", "SEL", "SF", "SFA", "SFB", "SFT", "SG", "SGH", "SHA", "SHG", "SHK", "SHL", "SI", "SIG", "SIM", "SK", "SL", "SLE", "SLF", "SLG", "SLK", "SLN", "SLS", "SLÜ", "SLZ", "SM", "SMÜ", "SN", "SNH", "SOK", "SOB", "SOG", "SOK", "SOL", "SÖM", "SON", "SP", "SPB", "SPN", "SPR", "SR", "SRB", "SRO", "ST", "STA", "STB", "STD", "STE", "STH", "STL", "STO", "SU", "SUL", "SÜW", "SW", "SWA", "SY", "SZ", "SZB", "TBB", "TDO", "TE", "TET", "TF", "TG", "TIR", "TO", "TÖL", "TÖN", "TP", "TR", "TS", "TT", "TÜ", "TUT", "ÜB", "UE", "UEM", "UER", "UFF", "UH", "UL", "UM", "UN", "USI", "V", "VAI", "VB", "VEC", "VER", "VG", "VIB", "VIE", "VIT", "VK", "VL", "VOF", "VOH", "VR", "VS", "W", "WA", "WAF", "WAK", "WAN", "WAR", "WAT", "WB", "WBS", "WD", "WDA", "WE", "WEB", "WEG", "WEL", "WEM", "WEN", "WER", "WES", "WF", "WG", "WHV", "WI", "WIL", "WIS", "WIT", "WIZ", "WK", "WL", "WLG", "WM", "WMS", "WN", "WND", "WO", "WOB", "WOH", "WOL", "WOR", "WOS", "WR", "WRN", "WS", "WSF", "WST", "WSW", "WT", "WTL", "WTM", "WÜ", "WÜM", "WUG", "WUN", "WUR", "WW", "WZ", "WZL", "Z", "ZE", "ZEL", "ZI", "ZIG", "ZP", "ZR", "ZS", "ZW", "ZZ"};

        Random r = new Random();
        int counter = r.nextInt(cityIdentifier.length);

        try {
            return cityIdentifier[counter - 1];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            return cityIdentifier[0];
        }
    }

    public static String GenerateUniqueIdentifier() {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", ""};

        int i = 0;
        String identifier = "";
        Random r = new Random();

        while(i < 2) {
            int counter = r.nextInt(alphabet.length);
            try {
                identifier += alphabet[counter];
            } catch(java.lang.ArrayIndexOutOfBoundsException e) {
                identifier += "";
            }
            i++;
        }

        return identifier;
    }

    public static String EndNumber() {
        int numberGen = (int) (Math.random() * 9999);
        return Integer.toString(numberGen);
    }

    public static void DoAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("New run? [y/n]");

        String input = scanner.next();

        if(input.equals("y")) {
            main(null);
        } else {
            if(input.equals("n")) {
                System.exit(0);
            } else {
                DoAgain();
            }
        }
    }

    public static String PlugInVehicle() {
        Random r = new Random();
        int probability = r.nextInt(126);

        if(probability == 93) {
            return "E";
        } else {
            return "";
        }
    }

}
