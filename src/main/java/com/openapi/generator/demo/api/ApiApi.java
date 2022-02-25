/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.openapi.generator.demo.api;

import java.util.List;

import javax.annotation.Generated;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.openapi.generator.demo.model.CommentDto;
import com.openapi.generator.demo.model.PostDto;
import com.openapi.generator.demo.model.PostResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-25T22:14:56.991779700+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "api", description = "the api API")
public interface ApiApi {

    default ApiApiDelegate getDelegate() {
        return new ApiApiDelegate() {};
    }

    /**
     * POST /api/posts/{postId}/comments
     *
     * @param postId  (required)
     * @param commentDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createComment",
        tags = { "comment-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CommentDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/posts/{postId}/comments",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CommentDto> createComment(
        @Parameter(name = "postId", description = "", required = true, schema = @Schema(description = "")) @PathVariable("postId") Long postId,
        @Parameter(name = "CommentDto", description = "", required = true, schema = @Schema(description = "")) @Valid @RequestBody CommentDto commentDto
    ) {
        return getDelegate().createComment(postId, commentDto);
    }


    /**
     * POST /api/posts
     *
     * @param postDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createPost",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  PostDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/posts",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PostDto> createPost(
        @Parameter(name = "PostDto", description = "", required = true, schema = @Schema(description = "")) @Valid @RequestBody PostDto postDto
    ) {
        return getDelegate().createPost(postDto);
    }


    /**
     * DELETE /api/posts/{postId}/comments/{commentId}
     *
     * @param postId  (required)
     * @param commentId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteComment",
        tags = { "comment-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/posts/{postId}/comments/{commentId}",
        produces = { "*/*" }
    )
    default ResponseEntity<String> deleteComment(
        @Parameter(name = "postId", description = "", required = true, schema = @Schema(description = "")) @PathVariable("postId") Long postId,
        @Parameter(name = "commentId", description = "", required = true, schema = @Schema(description = "")) @PathVariable("commentId") Long commentId
    ) {
        return getDelegate().deleteComment(postId, commentId);
    }


    /**
     * DELETE /api/posts/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deletePost",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/posts/{id}",
        produces = { "*/*" }
    )
    default ResponseEntity<String> deletePost(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id
    ) {
        return getDelegate().deletePost(id);
    }


    /**
     * GET /api/posts
     *
     * @param pageNo  (optional, default to 0)
     * @param pageSize  (optional, default to 10)
     * @param sortBy  (optional, default to id)
     * @param sortDir  (optional, default to asc)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAllPosts",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  PostResponse.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/posts",
        produces = { "*/*" }
    )
    default ResponseEntity<PostResponse> getAllPosts(
        @Parameter(name = "pageNo", description = "", schema = @Schema(description = "", defaultValue = "0")) @Valid @RequestParam(value = "pageNo", required = false, defaultValue = "0") Integer pageNo,
        @Parameter(name = "pageSize", description = "", schema = @Schema(description = "", defaultValue = "10")) @Valid @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize,
        @Parameter(name = "sortBy", description = "", schema = @Schema(description = "", defaultValue = "id")) @Valid @RequestParam(value = "sortBy", required = false, defaultValue = "id") String sortBy,
        @Parameter(name = "sortDir", description = "", schema = @Schema(description = "", defaultValue = "asc")) @Valid @RequestParam(value = "sortDir", required = false, defaultValue = "asc") String sortDir
    ) {
        return getDelegate().getAllPosts(pageNo, pageSize, sortBy, sortDir);
    }


    /**
     * GET /api/posts/{postId}/comments/{commentId}
     *
     * @param postId  (required)
     * @param commentId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getCommentById",
        tags = { "comment-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CommentDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/posts/{postId}/comments/{commentId}",
        produces = { "*/*" }
    )
    default ResponseEntity<CommentDto> getCommentById(
        @Parameter(name = "postId", description = "", required = true, schema = @Schema(description = "")) @PathVariable("postId") Long postId,
        @Parameter(name = "commentId", description = "", required = true, schema = @Schema(description = "")) @PathVariable("commentId") Long commentId
    ) {
        return getDelegate().getCommentById(postId, commentId);
    }


    /**
     * GET /api/posts/{postId}/comments
     *
     * @param postId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getCommentByPostId",
        tags = { "comment-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CommentDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/posts/{postId}/comments",
        produces = { "*/*" }
    )
    default ResponseEntity<List<CommentDto>> getCommentByPostId(
        @Parameter(name = "postId", description = "", required = true, schema = @Schema(description = "")) @PathVariable("postId") Long postId
    ) {
        return getDelegate().getCommentByPostId(postId);
    }


    /**
     * GET /api/posts/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getPostById",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  PostDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/posts/{id}",
        produces = { "*/*" }
    )
    default ResponseEntity<PostDto> getPostById(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id
    ) {
        return getDelegate().getPostById(id);
    }


    /**
     * PUT /api/posts/{postId}/comments/{commentId}
     *
     * @param postId  (required)
     * @param commentId  (required)
     * @param commentDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateComment",
        tags = { "comment-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CommentDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/posts/{postId}/comments/{commentId}",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CommentDto> updateComment(
        @Parameter(name = "postId", description = "", required = true, schema = @Schema(description = "")) @PathVariable("postId") Long postId,
        @Parameter(name = "commentId", description = "", required = true, schema = @Schema(description = "")) @PathVariable("commentId") Long commentId,
        @Parameter(name = "CommentDto", description = "", required = true, schema = @Schema(description = "")) @Valid @RequestBody CommentDto commentDto
    ) {
        return getDelegate().updateComment(postId, commentId, commentDto);
    }


    /**
     * PUT /api/posts/{id}
     *
     * @param id  (required)
     * @param postDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updatePost",
        tags = { "post-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  PostDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/posts/{id}",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PostDto> updatePost(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id,
        @Parameter(name = "PostDto", description = "", required = true, schema = @Schema(description = "")) @Valid @RequestBody PostDto postDto
    ) {
        return getDelegate().updatePost(id, postDto);
    }

}
