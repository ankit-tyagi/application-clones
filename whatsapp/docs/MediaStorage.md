
# MediaStorage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The media storage&#39;s UUID. |  [optional]
**messageId** | [**UUID**](UUID.md) | The UUID of the message containing the media. |  [optional]
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | The type of the media. |  [optional]
**mediaUrl** | **String** | The URL where the media is stored. |  [optional]
**thumbnailUrl** | **String** | The URL of the media&#39;s thumbnail, if applicable. |  [optional]


<a name="MediaTypeEnum"></a>
## Enum: MediaTypeEnum
Name | Value
---- | -----
IMAGE | &quot;image&quot;
VIDEO | &quot;video&quot;
AUDIO | &quot;audio&quot;
FILE | &quot;file&quot;



