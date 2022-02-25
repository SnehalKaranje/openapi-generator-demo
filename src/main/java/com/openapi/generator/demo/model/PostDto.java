package com.openapi.generator.demo.model;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PostDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-25T22:14:56.991779700+05:30[Asia/Calcutta]")
public class PostDto   {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("content")
  private String content;

  @JsonProperty("comments")
  @Valid
  private Set<CommentDto> comments = null;

  public PostDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PostDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull @Size(min = 2, max = 2147483647) 
  @Schema(name = "title", required = true)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PostDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull @Size(min = 10, max = 2147483647) 
  @Schema(name = "description", required = true)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostDto content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @NotNull 
  @Schema(name = "content", required = true)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public PostDto comments(Set<CommentDto> comments) {
    this.comments = comments;
    return this;
  }

  public PostDto addCommentsItem(CommentDto commentsItem) {
    if (this.comments == null) {
      this.comments = new LinkedHashSet<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
  */
  @Valid 
  @Schema(name = "comments", required = false)
  public Set<CommentDto> getComments() {
    return comments;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setComments(Set<CommentDto> comments) {
    this.comments = comments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostDto postDto = (PostDto) o;
    return Objects.equals(this.id, postDto.id) &&
        Objects.equals(this.title, postDto.title) &&
        Objects.equals(this.description, postDto.description) &&
        Objects.equals(this.content, postDto.content) &&
        Objects.equals(this.comments, postDto.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, content, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

