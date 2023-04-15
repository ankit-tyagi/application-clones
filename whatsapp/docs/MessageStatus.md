
# MessageStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The message status&#39;s UUID. |  [optional]
**messageId** | [**UUID**](UUID.md) | The UUID of the message. |  [optional]
**userId** | [**UUID**](UUID.md) | The UUID of the user for whom the message status is tracked. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the message. |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the message status was last updated. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SENT | &quot;sent&quot;
DELIVERED | &quot;delivered&quot;
READ | &quot;read&quot;



