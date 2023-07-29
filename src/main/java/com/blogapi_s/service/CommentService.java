package com.blogapi_s.service;

import com.blogapi_s.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
    List<CommentDto> findCommentByPostId(Long postId);

    void deleteCommentByPostId(long postId, long id);

    CommentDto getCommentByPostId(long postId, long id);

    CommentDto updateComment(Long postId, Long commentId, CommentDto commentDto);
}
