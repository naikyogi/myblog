package com.myblog.myblog11.service;

import com.myblog.myblog11.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postdto);

    PostDto getPostById(long id);
}
