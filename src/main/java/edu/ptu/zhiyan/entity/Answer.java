package edu.ptu.zhiyan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("answers")
public class Answer  implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String AID="aid";
    public static final String QID="qid";
    public static final String UID="uid";
    public static final String CONTENT="content";
    public static final String THUMB="thumb";
    public static final String TIMESTAMP="timestamp";


    @TableId(value = "aid", type = IdType.AUTO)
    private Integer aid;

    private Integer qid;

    private Integer uid;

    private String content;

    private Integer thumb;

    private Date timestamp;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getQid() {
        return qid;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "aid=" + aid +
                ", qid=" + qid +
                ", uid=" + uid +
                ", content='" + content + '\'' +
                ", thumb=" + thumb +
                ", timestamp=" + timestamp +
                '}';
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getThumb() {
        return thumb;
    }

    public void setThumb(Integer thumb) {
        this.thumb = thumb;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
