package com.globant.mymovies;

/**
 * Created by vibhor on 27/11/15.
 */
public class Constants {
    public static class NW {
        private static final String SERVER_BASE_URL = "http://192.168.5.45:3000";
        private static final String _GET_PAGE_URL = SERVER_BASE_URL + "/fetch?page_num=";
        private static final String _GET_LIKES_DISLIKES_URL = SERVER_BASE_URL + "/fetch/likes/dislikes?movie_id=";
        private static final String _UPDATE_LIKES_URL = SERVER_BASE_URL + "/update/likes?movie_id=";
        private static final String _UPDATE_DISLIKES_URL = SERVER_BASE_URL + "/update/dislikes?movie_id=";

        public static String GET_PAGE_URL(int pageNumber) {
            return _GET_PAGE_URL + pageNumber;
        }
        public static String GET_LIKES_DISLIKES_URL(String movieId) {
            return _GET_LIKES_DISLIKES_URL + movieId;
        }
        public static String UPDATE_LIKES_URL(String movieId) {
            return _UPDATE_LIKES_URL + movieId;
        }
        public static String UPDATE_DISLIKES_URL(String movieId) {
            return _UPDATE_DISLIKES_URL + movieId;
        }
    }
}
