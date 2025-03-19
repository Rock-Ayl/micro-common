package com.rock.micro.common.serivce.impl;

import com.rock.micro.base.db.mongo.BaseMongoServiceImpl;
import com.rock.micro.common.pojo.doc.TestDoc;
import com.rock.micro.common.serivce.TestMongoService;
import org.springframework.stereotype.Service;

@Service
public class TestMongoServiceImpl extends BaseMongoServiceImpl<TestDoc> implements TestMongoService {

}