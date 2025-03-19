package com.rock.micro.common.serivce.impl;

import com.rock.micro.base.db.elasticsearch.BaseElasticSearchServiceImpl;
import com.rock.micro.common.pojo.index.TestIndex;
import com.rock.micro.common.serivce.TestElasticSearchService;
import org.springframework.stereotype.Service;

@Service
public class TestElasticSearchServiceImpl extends BaseElasticSearchServiceImpl<TestIndex> implements TestElasticSearchService {

}