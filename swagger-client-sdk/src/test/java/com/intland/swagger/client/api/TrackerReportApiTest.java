/*
 * codeBeamer swagger API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.intland.swagger.client.api;

import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.model.ReportResult;
import com.intland.swagger.client.model.TrackerReportSettings;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrackerReportApi
 */
@Ignore
public class TrackerReportApiTest {

    private final TrackerReportApi api = new TrackerReportApi();

    
    /**
     * Creates a report of a specific tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTrackerReportTest() throws ApiException {
        Integer trackerId = null;
        TrackerReportSettings trackerReportSettings = null;
        TrackerReportSettings response = api.createTrackerReport(trackerId, trackerReportSettings);

        // TODO: test validations
    }
    
    /**
     * Deletes a report of a specific tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTrackerReportTest() throws ApiException {
        Integer trackerId = null;
        Integer reportId = null;
        api.deleteTrackerReport(trackerId, reportId);

        // TODO: test validations
    }
    
    /**
     * Get a report of a specific tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerReportTest() throws ApiException {
        Integer trackerId = null;
        Integer reportId = null;
        Integer page = null;
        Integer pageSize = null;
        ReportResult response = api.getTrackerReport(trackerId, reportId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Updates a report of a specific tracker
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTrackerReportTest() throws ApiException {
        Integer trackerId = null;
        Integer reportId = null;
        TrackerReportSettings trackerReportSettings = null;
        TrackerReportSettings response = api.updateTrackerReport(trackerId, reportId, trackerReportSettings);

        // TODO: test validations
    }
    
}