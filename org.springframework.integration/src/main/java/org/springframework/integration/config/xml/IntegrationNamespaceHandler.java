/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.config.xml;

/**
 * Namespace handler for the integration namespace.
 * 
 * @author Mark Fisher
 * @author Marius Bogoevici
 * @author Oleg Zhurakousky
 */
public class IntegrationNamespaceHandler extends AbstractIntegrationNamespaceHandler {

	public void init() {
		registerBeanDefinitionParser("channel", new PointToPointChannelParser());
		registerBeanDefinitionParser("thread-local-channel", new ThreadLocalChannelParser());
		registerBeanDefinitionParser("publish-subscribe-channel", new PublishSubscribeChannelParser());
		registerBeanDefinitionParser("service-activator", new ServiceActivatorParser());
		registerBeanDefinitionParser("transformer", new TransformerParser());
		registerBeanDefinitionParser("filter", new FilterParser());
		registerBeanDefinitionParser("router", new DefaultRouterParser());
		registerBeanDefinitionParser("header-value-router", new HeaderValueRouterParser());
		registerBeanDefinitionParser("payload-type-router", new PayloadTypeRouterParser());
		registerBeanDefinitionParser("recipient-list-router", new RecipientListRouterParser());
		registerBeanDefinitionParser("splitter", new SplitterParser());
		registerBeanDefinitionParser("aggregator", new AggregatorParser());
		registerBeanDefinitionParser("resequencer", new ResequencerParser());
		registerBeanDefinitionParser("header-enricher", new StandardHeaderEnricherParser());
		registerBeanDefinitionParser("object-to-string-transformer", new ObjectToStringTransformerParser());
		registerBeanDefinitionParser("payload-serializing-transformer", new PayloadSerializingTransformerParser());
		registerBeanDefinitionParser("payload-deserializing-transformer", new PayloadDeserializingTransformerParser());
		registerBeanDefinitionParser("claim-check-in", new ClaimCheckInParser());
		registerBeanDefinitionParser("claim-check-out", new ClaimCheckOutParser());
		registerBeanDefinitionParser("inbound-channel-adapter", new MethodInvokingInboundChannelAdapterParser());
		registerBeanDefinitionParser("outbound-channel-adapter", new MethodInvokingOutboundChannelAdapterParser());
		registerBeanDefinitionParser("logging-channel-adapter", new LoggingChannelAdapterParser());
		registerBeanDefinitionParser("gateway", new GatewayParser());
		registerBeanDefinitionParser("delayer", new DelayerParser());
		registerBeanDefinitionParser("bridge", new BridgeParser());
		registerBeanDefinitionParser("chain", new ChainParser());
		registerBeanDefinitionParser("selector", new SelectorParser());
		registerBeanDefinitionParser("selector-chain", new SelectorChainParser());
		registerBeanDefinitionParser("poller", new PollerParser());
		registerBeanDefinitionParser("annotation-config", new AnnotationConfigParser());
		registerBeanDefinitionParser("application-event-multicaster", new ApplicationEventMulticasterParser());
		registerBeanDefinitionParser("publisher", new PublisherParser());
		registerBeanDefinitionParser("channel-interceptor-chain", new GlobalChannelInterceptorParser());
	}

}
