package io.mapven.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by jtorregrosa on 9/02/16.
 */
@Entity
@Table(name = "project")
public class ProjectEntity {
    private int id;
    private String name;
    private String url;
    private String organization;
    private String description;
    private String cvsUrl;
    private Timestamp creationTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "organization")
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "cvsUrl")
    public String getCvsUrl() {
        return cvsUrl;
    }

    public void setCvsUrl(String cvsUrl) {
        this.cvsUrl = cvsUrl;
    }

    @Basic
    @Column(name = "creationTime")
    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectEntity that = (ProjectEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (organization != null ? !organization.equals(that.organization) : that.organization != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (cvsUrl != null ? !cvsUrl.equals(that.cvsUrl) : that.cvsUrl != null) return false;
        if (creationTime != null ? !creationTime.equals(that.creationTime) : that.creationTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (organization != null ? organization.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (cvsUrl != null ? cvsUrl.hashCode() : 0);
        result = 31 * result + (creationTime != null ? creationTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", organization='" + organization + '\'' +
                ", description='" + description + '\'' +
                ", cvsUrl='" + cvsUrl + '\'' +
                ", creationTime=" + creationTime +
                '}';
    }
}
