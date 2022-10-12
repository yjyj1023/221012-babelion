public class WhyClass {
    //클래스를 왜쓸까?
    //클래스와 array의 비교
    public static void main(String[] args) {
        /*
        id(Pk)
        address
        district
        category
        emergency_room
        name
        subdivision
        */
        String[] arr = new String[7];
        arr[0] = "A1120837";
        arr[1] = "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)";
        arr[2] = "서울특별시 금천구";
        arr[3] = "C";
        arr[4] = "2";

        Hospital hospital = new Hospital(
                "A1120837",
                "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)",
                "서울특별시 금천구",
                "C",
                2,
                "365병원",
                null
        );

        System.out.println(hospital.getDistrict());
    }
}
