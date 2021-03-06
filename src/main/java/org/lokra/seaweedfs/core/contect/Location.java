package org.lokra.seaweedfs.core.contect;

/**
 * @author Chiho Sin
 */
public class Location {
    private String url;
    private String publicUrl;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublicUrl() {
        return publicUrl;
    }

    public void setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
    }

    @Override
    public String toString() {
        return "Location{" +
                "url='" + url + '\'' +
                ", publicUrl='" + publicUrl + '\'' +
                '}';
    }
}
