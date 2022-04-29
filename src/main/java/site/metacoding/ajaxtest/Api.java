package site.metacoding.ajaxtest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Api {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String tm; // 예보시간

    @Column(length = 300, nullable = false)
    private String thema; //

    @Column(length = 100, nullable = false)
    private int courseId;

    @Column(length = 100, nullable = false)
    private long courseAreaId;

    @Column(length = 300, nullable = false)
    private String courseAreaName;

    @Column(length = 300, nullable = false)
    private String courseName;

    private int spotAreaId;

    @Column(length = 300, nullable = false)
    private String spotAreaName;

    @Column(length = 300, nullable = false)
    private String spotName;

    private int th3;
    private int wd;
    private int ws;
    private int sky;
    private int rhm;
    private int pop;
    private int rn;

}
