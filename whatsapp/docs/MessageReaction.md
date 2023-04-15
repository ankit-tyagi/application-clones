
# MessageReaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The message reaction&#39;s UUID. |  [optional]
**messageId** | [**UUID**](UUID.md) | The UUID of the message being reacted to. |  [optional]
**userId** | [**UUID**](UUID.md) | The UUID of the user who reacted to the message. |  [optional]
**reactionType** | [**ReactionTypeEnum**](#ReactionTypeEnum) | The type of reaction. |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the reaction was added. |  [optional]


<a name="ReactionTypeEnum"></a>
## Enum: ReactionTypeEnum
Name | Value
---- | -----
LIKE | &quot;like&quot;
DISLIKE | &quot;dislike&quot;
LOVE | &quot;love&quot;
LAUGH | &quot;laugh&quot;
SAD | &quot;sad&quot;
ANGRY | &quot;angry&quot;
SURPRISED | &quot;surprised&quot;



