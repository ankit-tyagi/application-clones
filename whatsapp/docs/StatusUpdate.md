
# StatusUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The status update&#39;s UUID. |  [optional]
**userId** | [**UUID**](UUID.md) | The UUID of the user who posted the status update. |  [optional]
**content** | **String** | The content of the status update. |  [optional]
**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | The type of the status update. |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the status update was posted. |  [optional]
**expiresIn** | **Integer** | The number of seconds until the status update expires. |  [optional]


<a name="ContentTypeEnum"></a>
## Enum: ContentTypeEnum
Name | Value
---- | -----
TEXT | &quot;text&quot;
IMAGE | &quot;image&quot;
VIDEO | &quot;video&quot;



