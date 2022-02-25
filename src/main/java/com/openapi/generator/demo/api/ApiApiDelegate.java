package com.openapi.generator.demo.api;

import java.util.List;
import java.util.Optional;

import javax.annotation.Generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import com.openapi.generator.demo.model.CommentDto;
import com.openapi.generator.demo.model.PostDto;
import com.openapi.generator.demo.model.PostResponse;

/**
 * A delegate to be called by the {@link ApiApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-25T22:14:56.991779700+05:30[Asia/Calcutta]")
public interface ApiApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/posts/{postId}/comments
     *
     * @param postId  (required)
     * @param commentDto  (required)
     * @return OK (status code 200)
     * @see ApiApi#createComment
     */
    default ResponseEntity<CommentDto> createComment(Long postId,
        CommentDto commentDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /api/posts
     *
     * @param postDto  (required)
     * @return OK (status code 200)
     * @see ApiApi#createPost
     */
    default ResponseEntity<PostDto> createPost(PostDto postDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"comments\" : [ { \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" }, { \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" } ], \"description\" : \"description\", \"id\" : 0, \"title\" : \"title\", \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /api/posts/{postId}/comments/{commentId}
     *
     * @param postId  (required)
     * @param commentId  (required)
     * @return OK (status code 200)
     * @see ApiApi#deleteComment
     */
    default ResponseEntity<String> deleteComment(Long postId,
        Long commentId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /api/posts/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     * @see ApiApi#deletePost
     */
    default ResponseEntity<String> deletePost(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/posts
     *
     * @param pageNo  (optional, default to 0)
     * @param pageSize  (optional, default to 10)
     * @param sortBy  (optional, default to id)
     * @param sortDir  (optional, default to asc)
     * @return OK (status code 200)
     * @see ApiApi#getAllPosts
     */
    default ResponseEntity<PostResponse> getAllPosts(Integer pageNo,
        Integer pageSize,
        String sortBy,
        String sortDir) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"last\" : true, \"pageNo\" : 0, \"totalPages\" : 5, \"pageSize\" : 6, \"content\" : [ { \"comments\" : [ { \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" }, { \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" } ], \"description\" : \"description\", \"id\" : 0, \"title\" : \"title\", \"content\" : \"content\" }, { \"comments\" : [ { \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" }, { \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" } ], \"description\" : \"description\", \"id\" : 0, \"title\" : \"title\", \"content\" : \"content\" } ], \"totalElements\" : 1 }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/posts/{postId}/comments/{commentId}
     *
     * @param postId  (required)
     * @param commentId  (required)
     * @return OK (status code 200)
     * @see ApiApi#getCommentById
     */
    default ResponseEntity<CommentDto> getCommentById(Long postId,
        Long commentId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/posts/{postId}/comments
     *
     * @param postId  (required)
     * @return OK (status code 200)
     * @see ApiApi#getCommentByPostId
     */
    default ResponseEntity<List<CommentDto>> getCommentByPostId(Long postId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/posts/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     * @see ApiApi#getPostById
     */
    default ResponseEntity<PostDto> getPostById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"comments\" : [ { \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" }, { \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" } ], \"description\" : \"description\", \"id\" : 0, \"title\" : \"title\", \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/posts/{postId}/comments/{commentId}
     *
     * @param postId  (required)
     * @param commentId  (required)
     * @param commentDto  (required)
     * @return OK (status code 200)
     * @see ApiApi#updateComment
     */
    default ResponseEntity<CommentDto> updateComment(Long postId,
        Long commentId,
        CommentDto commentDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /api/posts/{id}
     *
     * @param id  (required)
     * @param postDto  (required)
     * @return OK (status code 200)
     * @see ApiApi#updatePost
     */
    default ResponseEntity<PostDto> updatePost(Long id,
        PostDto postDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"comments\" : [ { \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" }, { \"name\" : \"name\", \"id\" : 0, \"body\" : \"body\", \"email\" : \"email\" } ], \"description\" : \"description\", \"id\" : 0, \"title\" : \"title\", \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
