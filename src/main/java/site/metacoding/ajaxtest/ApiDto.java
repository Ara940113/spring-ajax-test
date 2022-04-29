package site.metacoding.ajaxtest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiDto {
    private String courseName;
    private String courseAreaName;
    private String spotAreaName;
    private String spotName;
    private String tm;
    private int sky;
    private int rn;

    public Api toEntity(Api api) {
        Api apis = new Api();

        api.setCourseName(courseName);
        api.setCourseAreaName(courseAreaName);
        api.setSpotAreaName(spotAreaName);
        api.setSpotName(spotName);
        api.setTm(tm);
        api.setSky(sky);
        api.setRn(rn);

        return apis;
    }
}
