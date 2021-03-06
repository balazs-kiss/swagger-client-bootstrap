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
import com.intland.swagger.client.model.Attachment;
import java.io.File;
import com.intland.swagger.client.model.ModelAndView;
import com.intland.swagger.client.model.TrackerItemAttachmentRequest;
import com.intland.swagger.client.model.UploadAttachment;
import com.intland.swagger.client.model.UserDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrackerItemsAttachmentApi
 */
@Ignore
public class TrackerItemsAttachmentApiTest {

    private final TrackerItemsAttachmentApi api = new TrackerItemsAttachmentApi();

    
    /**
     * Delete attachment of tracker item by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTrackerItemAttachmentTest() throws ApiException {
        Integer itemId = null;
        Integer attachmentId = null;
        UserDto userDto = null;
        Attachment response = api.deleteTrackerItemAttachment(itemId, attachmentId, userDto);

        // TODO: test validations
    }
    
    /**
     * Delete attachments of tracker item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTrackerItemAttachmentsTest() throws ApiException {
        Integer itemId = null;
        UserDto userDto = null;
        api.deleteTrackerItemAttachments(itemId, userDto);

        // TODO: test validations
    }
    
    /**
     * Get attachment of tracker item by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerItemAttachmentTest() throws ApiException {
        UserDto user = null;
        Integer itemId = null;
        Integer attachmentId = null;
        Attachment response = api.getTrackerItemAttachment(user, itemId, attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get content of an attachment of tracker item by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerItemAttachmentContentTest() throws ApiException {
        UserDto user = null;
        Integer itemId = null;
        Integer attachmentId = null;
        ModelAndView response = api.getTrackerItemAttachmentContent(user, itemId, attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get attachments of a tracker item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerItemAttachmentContentsTest() throws ApiException {
        UserDto user = null;
        Integer itemId = null;
        File response = api.getTrackerItemAttachmentContents(user, itemId);

        // TODO: test validations
    }
    
    /**
     * Get attachments of tracker item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerItemAttachmentsTest() throws ApiException {
        UserDto user = null;
        Integer itemId = null;
        List<Attachment> response = api.getTrackerItemAttachments(user, itemId);

        // TODO: test validations
    }
    
    /**
     * Get attachments of tracker items matching the extension or mime type filters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerItemsAttachmentContentsTest() throws ApiException {
        TrackerItemAttachmentRequest trackerItemAttachmentRequest = null;
        File response = api.getTrackerItemsAttachmentContents(trackerItemAttachmentRequest);

        // TODO: test validations
    }
    
    /**
     * Upload an attachment to a tracker item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updloadTrackerItemAttachmentTest() throws ApiException {
        Integer itemId = null;
        UploadAttachment uploadAttachmentModel = null;
        List<Attachment> response = api.updloadTrackerItemAttachment(itemId, uploadAttachmentModel);

        // TODO: test validations
    }
    
}
