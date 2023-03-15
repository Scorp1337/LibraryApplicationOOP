package org.example;

public class ArtAlbum extends Book{

    public String paperQuality;

    public ArtAlbum(String name, int numberOfPages, String paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "ArtAlbum[" +

                "name='" + name + '\'' +
                " , paperQuality='" + paperQuality + '\'' +
                ", numberOfPages=" + numberOfPages +
                ']';
    }
}
