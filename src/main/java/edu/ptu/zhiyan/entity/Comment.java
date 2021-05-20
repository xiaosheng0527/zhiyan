package edu.ptu.zhiyan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("comments")
public class Comment  implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String CID="cid";
    public static final String AID="aid";
    public static final String UID="uid";
    public static final String CONTENT="content";
    public static final String THUMB="thumb";
    public static final String TIMESTAMP="timestamp";


    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    private Integer aid;

    private Integer uid;

    private String content;

    private Integer thumb;

    private Date timestamp;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
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

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", aid=" + aid +
                ", uid=" + uid +
                ", content='" + content + '\'' +
                ", thumb=" + thumb +
                ", timestamp=" + timestamp +
                '}';
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
