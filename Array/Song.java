class Song {
    String type;
    String  SingerName ;

public static void main(String[] args) {
    Song s1 = new Song();
    s1.SingerName = "Ariji";
    s1.type = "Classic";
    System.out.println("Singer name:  " + s1.SingerName);
    System.out.println("Song Type  :" + s1.type);

    Song s2 = new Song();
    s2.SingerName = "HoneySingh";
    s2.type = "Panjabi";
    System.out.println("Singer name:  " + s2.SingerName);
    System.out.println("Song Type:  " + s2.type);
}
}
