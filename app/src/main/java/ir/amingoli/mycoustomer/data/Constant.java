package ir.amingoli.mycoustomer.data;

public class Constant {

    /**
     * -------------------- EDIT THIS WITH YOURS -------------------------------------------------
     */

    // Edit WEB_URL with your url. Make sure you have backslash('/') in the end url
    public static String WEB_URL = "http://amingoli.com/markeet/";

    /* [ IMPORTANT ] be careful when edit this security code */
    /* This string must be same with security code at Server, if its different android unable to submit order */

    /**
     * ------------------- DON'T EDIT THIS -------------------------------------------------------
     */

    // this limit value used for give pagination (request and display) to decrease payload
    public static int NEWS_PER_REQUEST = 10;
    public static int PRODUCT_PER_REQUEST = 10;
    public static int CUSTOMER_PAGE = 10;
    public static int WISHLIST_PAGE = 20;

    // retry load image notification
    public static int LOAD_IMAGE_NOTIF_RETRY = 3;

    // Method get path to image
    public static String getURLimgProduct(String file_name) {
        return WEB_URL + "uploads/product/" + file_name;
    }

    public static String getURLimgNews(String file_name) {
        return WEB_URL + "uploads/news/" + file_name;
    }

    public static String getURLimgCategory(String file_name) {
        return WEB_URL + "uploads/category/" + file_name;
    }

    private static String TERM = WEB_URL + "term/";
    private static String format = ".html";
    public static String getUrlTerm_1 = TERM + "1" + format;
    public static String getUrlTerm_2 = TERM + "2" + format;
    public static String getUrlTerm_3 = TERM + "3" + format;
    public static String getUrlTerm_4 = TERM + "4" + format;

}
