
# Message

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The message&#39;s UUID. |  [optional]
**chatId** | [**UUID**](UUID.md) | The UUID of the chat where the message was sent. |  [optional]
**senderId** | [**UUID**](UUID.md) | The UUID of the user who sent the message. |  [optional]
**content** | **String** | The content of the message. |  [optional]
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | The type of the message. |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the message was sent. |  [optional]
**isDeleted** | **Boolean** | Whether the message has been deleted. |  [optional]


<a name="MessageTypeEnum"></a>
## Enum: MessageTypeEnum
Name | Value
---- | -----
TEXT | &quot;text&quot;
IMAGE | &quot;image&quot;
VIDEO | &quot;video&quot;
AUDIO | &quot;audio&quot;
FILE | &quot;file&quot;
LOCATION | &quot;location&quot;



