package com.blogapi_s.service;

import com.blogapi_s.payload.PostDto;

import java.util.List;

public interface PostService {
    public PostDto createPost(PostDto postDto);
    PostDto getPostById(long id);
    List<PostDto> getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

    void deletPost(long id);
    PostDto updatePost(long id, PostDto postDto);
}
