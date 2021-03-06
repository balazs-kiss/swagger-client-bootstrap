# openapi-java-client

codeBeamer swagger API
- API version: 2.0
  - Build date: 2019-11-10T15:21:24.239+01:00[Europe/Budapest]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

  For more information, please visit [https://codebeamer.com](https://codebeamer.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>2.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:2.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-2.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.intland.swagger.client.*;
import com.intland.swagger.client.auth.*;
import com.intland.swagger.client.model.*;
import com.intland.swagger.client.api.AssociationApi;

import java.io.File;
import java.util.*;

public class AssociationApiExample {

    public static void main(String[] args) {
        
        AssociationApi apiInstance = new AssociationApi();
        Integer associationId = 56; // Integer | 
        try {
            apiInstance.deleteAssociation(associationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssociationApi#deleteAssociation");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/cb/api/docs*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssociationApi* | [**deleteAssociation**](docs/AssociationApi.md#deleteAssociation) | **DELETE** /v2/associations/{associationId} | Delete association
*AssociationApi* | [**getAssociationType**](docs/AssociationApi.md#getAssociationType) | **GET** /v2/associations/types/{associationTypeId} | Get association by id
*BaselineApi* | [**getBaselineTrackerItemRelations**](docs/BaselineApi.md#getBaselineTrackerItemRelations) | **GET** /v2/item/{itemId}/relations | Get tracker items for a baseline version
*BaselineApi* | [**getBaselineTrackerItemsRelations**](docs/BaselineApi.md#getBaselineTrackerItemsRelations) | **POST** /v2/items/relations | Get tracker items for a baseline version
*BranchesApi* | [**getTrackerItemOnBranch**](docs/BranchesApi.md#getTrackerItemOnBranch) | **GET** /v2/branches/{branchId}/item | Get tracker item on branch
*GroupApi* | [**getGroup**](docs/GroupApi.md#getGroup) | **GET** /v2/user/group/{groupId} | Get user group
*GroupApi* | [**getGroups**](docs/GroupApi.md#getGroups) | **GET** /v2/user/group | Get user groups
*ProjectApi* | [**deployConfiguration**](docs/ProjectApi.md#deployConfiguration) | **POST** /v2/project/deploy | Deploy a project configuration to a Project
*ProjectApi* | [**export**](docs/ProjectApi.md#export) | **POST** /v2/project/{projectId}/content | Exports the specified project to a zip file
*ProjectApi* | [**getAllTrackersInProject**](docs/ProjectApi.md#getAllTrackersInProject) | **POST** /v2/project/{projectId}/trackers | Get the list of all trackers in a project
*ProjectApi* | [**getProjectById**](docs/ProjectApi.md#getProjectById) | **GET** /v2/project/{projectId} | Get project
*ProjectApi* | [**getProjects**](docs/ProjectApi.md#getProjects) | **GET** /v2/project | Get projects
*ProjectApi* | [**getTrackers**](docs/ProjectApi.md#getTrackers) | **GET** /v2/project/{projectId}/trackers | Get trackers
*ReportApi* | [**createReport**](docs/ReportApi.md#createReport) | **POST** /v2/report | Create a report
*ReportApi* | [**getReportById**](docs/ReportApi.md#getReportById) | **GET** /v2/report/{reportId}/results | Get a report results by id of the report
*ReportApi* | [**getReportItemsById**](docs/ReportApi.md#getReportItemsById) | **GET** /v2/report/{reportId}/items | Get a report items by id of the report
*ReportApi* | [**updateReport**](docs/ReportApi.md#updateReport) | **PUT** /v2/report/{reportId} | Update report settings
*RoleApi* | [**getRole**](docs/RoleApi.md#getRole) | **GET** /v2/role/{roleId} | Get role
*RoleApi* | [**getRoles**](docs/RoleApi.md#getRoles) | **GET** /v2/role | Get roles
*TrackerApi* | [**deleteTracker**](docs/TrackerApi.md#deleteTracker) | **DELETE** /v2/tracker/{trackerId} | Deletes a tracker
*TrackerApi* | [**getChoiceOption**](docs/TrackerApi.md#getChoiceOption) | **GET** /v2/tracker/{trackerId}/field/{fieldId}/option/{optionId} | Get option of a choice field of tracker
*TrackerApi* | [**getTracker**](docs/TrackerApi.md#getTracker) | **GET** /v2/tracker/{trackerId} | Get tracker
*TrackerApi* | [**getTrackerField**](docs/TrackerApi.md#getTrackerField) | **GET** /v2/tracker/{trackerId}/field/{fieldId} | Get field of tracker
*TrackerApi* | [**getTrackerFields**](docs/TrackerApi.md#getTrackerFields) | **GET** /v2/tracker/{trackerId}/field | Get fields of tracker
*TrackerApi* | [**getTrackerType**](docs/TrackerApi.md#getTrackerType) | **GET** /v2/tracker/types/{trackerTypeId} | Get the immutable definition of a tracker type
*TrackerApi* | [**getTrackerTypes**](docs/TrackerApi.md#getTrackerTypes) | **GET** /v2/tracker/types | Get the list of tracker types
*TrackerItemApi* | [**addChildToTrackerItem**](docs/TrackerItemApi.md#addChildToTrackerItem) | **POST** /v2/items/{itemId}/children | Add a child item to a tracker item
*TrackerItemApi* | [**createTrackerItem**](docs/TrackerItemApi.md#createTrackerItem) | **POST** /v2/tracker/{trackerId}/item | Create a tracker item
*TrackerItemApi* | [**createTrackerItemWithParentId**](docs/TrackerItemApi.md#createTrackerItemWithParentId) | **POST** /v2/tracker/{trackerId}/item/{parentItemId} | Create a tracker item with parent
*TrackerItemApi* | [**deleteTrackerItem**](docs/TrackerItemApi.md#deleteTrackerItem) | **DELETE** /v2/item/{itemId} | Delete tracker item
*TrackerItemApi* | [**findTrackerItemChildren**](docs/TrackerItemApi.md#findTrackerItemChildren) | **GET** /v2/items/{itemId}/children | Get child items of a tracker item
*TrackerItemApi* | [**findTrackerItems**](docs/TrackerItemApi.md#findTrackerItems) | **GET** /v2/item | Get tracker items by cbQL query string
*TrackerItemApi* | [**findTrackerItemsByCbQL**](docs/TrackerItemApi.md#findTrackerItemsByCbQL) | **POST** /v2/item | Get tracker items by cbQL query string
*TrackerItemApi* | [**getTrackerItem**](docs/TrackerItemApi.md#getTrackerItem) | **GET** /v2/item/{itemId} | Get basic tracker item
*TrackerItemApi* | [**getTrackerItemHistory**](docs/TrackerItemApi.md#getTrackerItemHistory) | **GET** /v2/item/{itemId}/history | Get tracker item history
*TrackerItemApi* | [**getTrackerItems**](docs/TrackerItemApi.md#getTrackerItems) | **POST** /v2/items | Get tracker items
*TrackerItemApi* | [**patchChildrenOfTrackerItem**](docs/TrackerItemApi.md#patchChildrenOfTrackerItem) | **PATCH** /v2/items/{itemId}/children | Patch the child item list of a tracker item
*TrackerItemApi* | [**replaceChildrenOfTrackerItem**](docs/TrackerItemApi.md#replaceChildrenOfTrackerItem) | **PUT** /v2/items/{itemId}/children | Replace the child item list of a tracker item
*TrackerItemApi* | [**updateCustomFieldTrackerItem**](docs/TrackerItemApi.md#updateCustomFieldTrackerItem) | **PUT** /v2/item/{itemId}/field | Update field of tracker item
*TrackerItemApi* | [**updateTableFieldTrackerItem**](docs/TrackerItemApi.md#updateTableFieldTrackerItem) | **PUT** /v2/item/{itemId}/field/table/{tableFieldId} | Update table field of tracker item
*TrackerItemApi* | [**updateTrackerItem**](docs/TrackerItemApi.md#updateTrackerItem) | **PUT** /v2/item/{itemId} | Update tracker item
*TrackerItemsAttachmentApi* | [**deleteTrackerItemAttachment**](docs/TrackerItemsAttachmentApi.md#deleteTrackerItemAttachment) | **DELETE** /v2/item/{itemId}/attachment/{attachmentId} | Delete attachment of tracker item by id
*TrackerItemsAttachmentApi* | [**deleteTrackerItemAttachments**](docs/TrackerItemsAttachmentApi.md#deleteTrackerItemAttachments) | **DELETE** /v2/item/{itemId}/attachment | Delete attachments of tracker item
*TrackerItemsAttachmentApi* | [**getTrackerItemAttachment**](docs/TrackerItemsAttachmentApi.md#getTrackerItemAttachment) | **GET** /v2/item/{itemId}/attachment/{attachmentId} | Get attachment of tracker item by id
*TrackerItemsAttachmentApi* | [**getTrackerItemAttachmentContent**](docs/TrackerItemsAttachmentApi.md#getTrackerItemAttachmentContent) | **GET** /v2/item/{itemId}/attachment/{attachmentId}/content | Get content of an attachment of tracker item by id
*TrackerItemsAttachmentApi* | [**getTrackerItemAttachmentContents**](docs/TrackerItemsAttachmentApi.md#getTrackerItemAttachmentContents) | **GET** /v2/item/{itemId}/attachments/content | Get attachments of a tracker item
*TrackerItemsAttachmentApi* | [**getTrackerItemAttachments**](docs/TrackerItemsAttachmentApi.md#getTrackerItemAttachments) | **GET** /v2/item/{itemId}/attachment | Get attachments of tracker item
*TrackerItemsAttachmentApi* | [**getTrackerItemsAttachmentContents**](docs/TrackerItemsAttachmentApi.md#getTrackerItemsAttachmentContents) | **POST** /v2/item/attachments/content | Get attachments of tracker items matching the extension or mime type filters
*TrackerItemsAttachmentApi* | [**updloadTrackerItemAttachment**](docs/TrackerItemsAttachmentApi.md#updloadTrackerItemAttachment) | **POST** /v2/item/{itemId}/attachment | Upload an attachment to a tracker item
*TrackerItemsCommentApi* | [**commentOnTrackerItem**](docs/TrackerItemsCommentApi.md#commentOnTrackerItem) | **POST** /v2/item/{itemId}/comment | Comment on a tracker item
*TrackerItemsCommentApi* | [**deleteTrackerItemComment**](docs/TrackerItemsCommentApi.md#deleteTrackerItemComment) | **DELETE** /v2/item/{itemId}/comment/{commentId} | Delete comment of tracker item by id
*TrackerItemsCommentApi* | [**deleteTrackerItemComments**](docs/TrackerItemsCommentApi.md#deleteTrackerItemComments) | **DELETE** /v2/item/{itemId}/comment | Delete comments of tracker item by item id
*TrackerItemsCommentApi* | [**editCommentOnTrackerItem**](docs/TrackerItemsCommentApi.md#editCommentOnTrackerItem) | **PUT** /v2/item/{itemId}/comment/{commentId} | Edit comment on a tracker item
*TrackerItemsCommentApi* | [**getTrackerItemComment**](docs/TrackerItemsCommentApi.md#getTrackerItemComment) | **GET** /v2/item/{itemId}/comment/{commentId} | Get comment of tracker item by id
*TrackerItemsCommentApi* | [**getTrackerItemComments**](docs/TrackerItemsCommentApi.md#getTrackerItemComments) | **GET** /v2/item/{itemId}/comment | Get comments of tracker item
*TrackerItemsCommentApi* | [**replyOnCommentOfTrackerItem**](docs/TrackerItemsCommentApi.md#replyOnCommentOfTrackerItem) | **POST** /v2/item/{itemId}/comment/{commentId} | Reply on a comment of a tracker item
*TrackerPermissionApi* | [**getTrackerPermission**](docs/TrackerPermissionApi.md#getTrackerPermission) | **GET** /v2/trackers/permissions/{trackerPermissionId} | Get the immutable definition of a tracker permission
*TrackerPermissionApi* | [**getTrackerPermissions**](docs/TrackerPermissionApi.md#getTrackerPermissions) | **GET** /v2/trackers/permissions | Get available tracker permissions
*TrackerPermissionApi* | [**getTrackerPermissionsWithRoles**](docs/TrackerPermissionApi.md#getTrackerPermissionsWithRoles) | **GET** /v2/trackers/{trackerId}/permissions | List tracker permissions per role
*TrackerPermissionApi* | [**updatePermission**](docs/TrackerPermissionApi.md#updatePermission) | **PUT** /v2/trackers/{trackerId}/roles/{roleId}/permissions | Set the tracker permissions for a specific role
*TrackerReportApi* | [**createTrackerReport**](docs/TrackerReportApi.md#createTrackerReport) | **POST** /v2/tracker/{trackerId}/report | Creates a report of a specific tracker
*TrackerReportApi* | [**deleteTrackerReport**](docs/TrackerReportApi.md#deleteTrackerReport) | **DELETE** /v2/tracker/{trackerId}/report/{reportId} | Deletes a report of a specific tracker
*TrackerReportApi* | [**getTrackerReport**](docs/TrackerReportApi.md#getTrackerReport) | **GET** /v2/tracker/{trackerId}/report/{reportId}/results | Get a report of a specific tracker
*TrackerReportApi* | [**updateTrackerReport**](docs/TrackerReportApi.md#updateTrackerReport) | **PUT** /v2/tracker/{trackerId}/report/{reportId} | Updates a report of a specific tracker
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /v2/user/{userId} | Get user
*UserApi* | [**getUserByEmail**](docs/UserApi.md#getUserByEmail) | **GET** /v2/user/findByEmail | Get user by email address
*UserApi* | [**getUserByName**](docs/UserApi.md#getUserByName) | **GET** /v2/user/findByName | Get user by name
*UserApi* | [**getUsers**](docs/UserApi.md#getUsers) | **GET** /v2/user | Get users


## Documentation for Models

 - [AbstractField](docs/AbstractField.md)
 - [AbstractFieldValue](docs/AbstractFieldValue.md)
 - [AbstractReference](docs/AbstractReference.md)
 - [AbstractTrackerItemReference](docs/AbstractTrackerItemReference.md)
 - [AssociationType](docs/AssociationType.md)
 - [Attachment](docs/Attachment.md)
 - [ChoiceFieldValue](docs/ChoiceFieldValue.md)
 - [ChoiceFieldValueAllOf](docs/ChoiceFieldValueAllOf.md)
 - [ChoiceOptionReference](docs/ChoiceOptionReference.md)
 - [ChoiceOptionReferenceAllOf](docs/ChoiceOptionReferenceAllOf.md)
 - [Comment](docs/Comment.md)
 - [CommentAllOf](docs/CommentAllOf.md)
 - [CommentReference](docs/CommentReference.md)
 - [DeployProject](docs/DeployProject.md)
 - [DownstreamTrackerItemReference](docs/DownstreamTrackerItemReference.md)
 - [EditComment](docs/EditComment.md)
 - [ExportProject](docs/ExportProject.md)
 - [FastDateFormat](docs/FastDateFormat.md)
 - [FastDateFormatLocale](docs/FastDateFormatLocale.md)
 - [FastDateFormatTimeZone](docs/FastDateFormatTimeZone.md)
 - [GeoLocationDto](docs/GeoLocationDto.md)
 - [IncomingTrackerItemAssociation](docs/IncomingTrackerItemAssociation.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineObject1](docs/InlineObject1.md)
 - [ModelAndView](docs/ModelAndView.md)
 - [ModelMap](docs/ModelMap.md)
 - [OutgoingTrackerItemAssociation](docs/OutgoingTrackerItemAssociation.md)
 - [PermissionIdsRequest](docs/PermissionIdsRequest.md)
 - [PostComment](docs/PostComment.md)
 - [Project](docs/Project.md)
 - [ReportAggregate](docs/ReportAggregate.md)
 - [ReportCell](docs/ReportCell.md)
 - [ReportColumn](docs/ReportColumn.md)
 - [ReportColumnSettings](docs/ReportColumnSettings.md)
 - [ReportGroup](docs/ReportGroup.md)
 - [ReportGroupWithGroups](docs/ReportGroupWithGroups.md)
 - [ReportGroupWithGroupsAllOf](docs/ReportGroupWithGroupsAllOf.md)
 - [ReportGroupWithReferencedRows](docs/ReportGroupWithReferencedRows.md)
 - [ReportGroupWithReferencedRowsAllOf](docs/ReportGroupWithReferencedRowsAllOf.md)
 - [ReportGroupWithRows](docs/ReportGroupWithRows.md)
 - [ReportGroupWithRowsAllOf](docs/ReportGroupWithRowsAllOf.md)
 - [ReportItem](docs/ReportItem.md)
 - [ReportItemReference](docs/ReportItemReference.md)
 - [ReportItemResult](docs/ReportItemResult.md)
 - [ReportPagingInformation](docs/ReportPagingInformation.md)
 - [ReportPermission](docs/ReportPermission.md)
 - [ReportReferenceLevel](docs/ReportReferenceLevel.md)
 - [ReportReferenceLevelSettings](docs/ReportReferenceLevelSettings.md)
 - [ReportReferencedRow](docs/ReportReferencedRow.md)
 - [ReportReferencedRowAllOf](docs/ReportReferencedRowAllOf.md)
 - [ReportResult](docs/ReportResult.md)
 - [ReportRow](docs/ReportRow.md)
 - [ResizableReportColumnSettings](docs/ResizableReportColumnSettings.md)
 - [Role](docs/Role.md)
 - [RoleAllOf](docs/RoleAllOf.md)
 - [RoleReference](docs/RoleReference.md)
 - [RoleWithPermissions](docs/RoleWithPermissions.md)
 - [SimpleReportSettings](docs/SimpleReportSettings.md)
 - [TableFieldValue](docs/TableFieldValue.md)
 - [TableFieldValueAllOf](docs/TableFieldValueAllOf.md)
 - [Tracker](docs/Tracker.md)
 - [TrackerFilteringRequest](docs/TrackerFilteringRequest.md)
 - [TrackerItem](docs/TrackerItem.md)
 - [TrackerItemAllOf](docs/TrackerItemAllOf.md)
 - [TrackerItemAttachmentRequest](docs/TrackerItemAttachmentRequest.md)
 - [TrackerItemAttachmentRequestAllOf](docs/TrackerItemAttachmentRequestAllOf.md)
 - [TrackerItemChange](docs/TrackerItemChange.md)
 - [TrackerItemChildReference](docs/TrackerItemChildReference.md)
 - [TrackerItemHistory](docs/TrackerItemHistory.md)
 - [TrackerItemHistoryRevision](docs/TrackerItemHistoryRevision.md)
 - [TrackerItemReference](docs/TrackerItemReference.md)
 - [TrackerItemRelationsResult](docs/TrackerItemRelationsResult.md)
 - [TrackerItemRevision](docs/TrackerItemRevision.md)
 - [TrackerItemRevisionSearchResult](docs/TrackerItemRevisionSearchResult.md)
 - [TrackerItemRowChange](docs/TrackerItemRowChange.md)
 - [TrackerItemRowChangeAllOf](docs/TrackerItemRowChangeAllOf.md)
 - [TrackerItemSearchRequest](docs/TrackerItemSearchRequest.md)
 - [TrackerItemSearchResult](docs/TrackerItemSearchResult.md)
 - [TrackerItemsRequest](docs/TrackerItemsRequest.md)
 - [TrackerPermission](docs/TrackerPermission.md)
 - [TrackerPermissionAllOf](docs/TrackerPermissionAllOf.md)
 - [TrackerPermissionReference](docs/TrackerPermissionReference.md)
 - [TrackerReference](docs/TrackerReference.md)
 - [TrackerReportSettings](docs/TrackerReportSettings.md)
 - [TrackerType](docs/TrackerType.md)
 - [TrackerTypeReference](docs/TrackerTypeReference.md)
 - [UpdateTrackerItemChildrenRequest](docs/UpdateTrackerItemChildrenRequest.md)
 - [UpdateTrackerItemField](docs/UpdateTrackerItemField.md)
 - [UpdateTrackerItemTableField](docs/UpdateTrackerItemTableField.md)
 - [UploadAttachment](docs/UploadAttachment.md)
 - [UpstreamTrackerItemReference](docs/UpstreamTrackerItemReference.md)
 - [User](docs/User.md)
 - [UserAllOf](docs/UserAllOf.md)
 - [UserDto](docs/UserDto.md)
 - [UserDtoLdapName](docs/UserDtoLdapName.md)
 - [UserGroup](docs/UserGroup.md)
 - [UserGroupAllOf](docs/UserGroupAllOf.md)
 - [UserGroupReference](docs/UserGroupReference.md)
 - [UserReference](docs/UserReference.md)
 - [UserSearchResult](docs/UserSearchResult.md)
 - [View](docs/View.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### BasicAuth

- **Type**: HTTP basic authentication

### BearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



