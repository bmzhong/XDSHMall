package com.xidian.community.mapper;

import com.xidian.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}