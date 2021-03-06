package com.reprezen.kaizen.oasparser.ovl3;

import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.databind.JsonNode;
import com.reprezen.jsonoverlay.JsonOverlay;
import com.reprezen.jsonoverlay.MapOverlay;
import com.reprezen.jsonoverlay.ObjectOverlay;
import com.reprezen.jsonoverlay.Overlay;
import com.reprezen.jsonoverlay.OverlayFactory;
import com.reprezen.jsonoverlay.PropertiesOverlay;
import com.reprezen.jsonoverlay.ReferenceManager;
import com.reprezen.jsonoverlay.StringOverlay;
import com.reprezen.kaizen.oasparser.model3.Header;
import com.reprezen.kaizen.oasparser.model3.Link;
import com.reprezen.kaizen.oasparser.model3.OpenApi3;
import com.reprezen.kaizen.oasparser.model3.Server;

public class LinkImpl extends PropertiesOverlay<Link> implements Link {

	private Overlay<Link> overlay = Overlay.of(this);

	@Override
	public String getName() {
		return overlay.getParent() instanceof MapOverlay<?> ? overlay.getPathInParent() : null;
	}

	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public LinkImpl(JsonNode json, JsonOverlay<?> parent, ReferenceManager refMgr) {
		super(json, parent, factory, refMgr);
	}

	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public LinkImpl(Link link, JsonOverlay<?> parent, ReferenceManager refMgr) {
		super(link, parent, factory, refMgr);
	}

	// OperationId
	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public String getOperationId() {
		return _get("operationId", String.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setOperationId(String operationId) {
		_setScalar("operationId", operationId, String.class);
	}

	// OperationRef
	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public String getOperationRef() {
		return _get("operationRef", String.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setOperationRef(String operationRef) {
		_setScalar("operationRef", operationRef, String.class);
	}

	// Parameter
	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Map<String, String> getParameters() {
		return _getMap("parameters", String.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Map<String, String> getParameters(boolean elaborate) {
		return _getMap("parameters", elaborate, String.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public boolean hasParameters() {
		return _isPresent("parameters");
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public boolean hasParameter(String name) {
		return _getMap("parameters", String.class).containsKey(name);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public String getParameter(String name) {
		return _get("parameters", name, String.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setParameters(Map<String, String> parameters) {
		_setMap("parameters", parameters, String.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setParameter(String name, String parameter) {
		_set("parameters", name, parameter, String.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void removeParameter(String name) {
		_remove("parameters", name, String.class);
	}

	// Header
	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Map<String, Header> getHeaders() {
		return _getMap("headers", Header.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Map<String, Header> getHeaders(boolean elaborate) {
		return _getMap("headers", elaborate, Header.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public boolean hasHeaders() {
		return _isPresent("headers");
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public boolean hasHeader(String name) {
		return _getMap("headers", Header.class).containsKey(name);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Header getHeader(String name) {
		return _get("headers", name, Header.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setHeaders(Map<String, Header> headers) {
		_setMap("headers", headers, Header.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setHeader(String name, Header header) {
		_set("headers", name, header, Header.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void removeHeader(String name) {
		_remove("headers", name, Header.class);
	}

	// Description
	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public String getDescription() {
		return _get("description", String.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setDescription(String description) {
		_setScalar("description", description, String.class);
	}

	// Server
	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Server getServer() {
		return _get("server", Server.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Server getServer(boolean elaborate) {
		return _get("server", elaborate, Server.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setServer(Server server) {
		_setScalar("server", server, Server.class);
	}

	// Extension
	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Map<String, Object> getExtensions() {
		return _getMap("extensions", Object.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Map<String, Object> getExtensions(boolean elaborate) {
		return _getMap("extensions", elaborate, Object.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public boolean hasExtensions() {
		return _isPresent("extensions");
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public boolean hasExtension(String name) {
		return _getMap("extensions", Object.class).containsKey(name);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Object getExtension(String name) {
		return _get("extensions", name, Object.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setExtensions(Map<String, Object> extensions) {
		_setMap("extensions", extensions, Object.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void setExtension(String name, Object extension) {
		_set("extensions", name, extension, Object.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public void removeExtension(String name) {
		_remove("extensions", name, Object.class);
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	protected void _elaborateJson() {
		_createScalar("operationId", "operationId", StringOverlay.factory);
		_createScalar("operationRef", "operationRef", StringOverlay.factory);
		_createMap("parameters", "parameters", StringOverlay.factory, null);
		_createMap("headers", "headers", HeaderImpl.factory, null);
		_createScalar("description", "description", StringOverlay.factory);
		_createScalar("server", "server", ServerImpl.factory);
		_createMap("extensions", "", ObjectOverlay.factory, "x-.+");
	}

	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public static OverlayFactory<Link> factory = new OverlayFactory<Link>() {

		@Override
		protected Class<? extends JsonOverlay<? super Link>> getOverlayClass() {
			return LinkImpl.class;
		}

		@Override
		public JsonOverlay<Link> _create(Link link, JsonOverlay<?> parent, ReferenceManager refMgr) {
			JsonOverlay<?> overlay;
			overlay = new LinkImpl(link, parent, refMgr);
			@SuppressWarnings("unchecked")
			JsonOverlay<Link> castOverlay = (JsonOverlay<Link>) overlay;
			return castOverlay;
		}

		@Override
		public JsonOverlay<Link> _create(JsonNode json, JsonOverlay<?> parent, ReferenceManager refMgr) {
			JsonOverlay<?> overlay;
			overlay = new LinkImpl(json, parent, refMgr);
			@SuppressWarnings("unchecked")
			JsonOverlay<Link> castOverlay = (JsonOverlay<Link>) overlay;
			return castOverlay;
		}
	};

	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	private static Class<? extends Link> getSubtypeOf(Link link) {
		return Link.class;
	}

	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	private static Class<? extends Link> getSubtypeOf(JsonNode json) {
		return Link.class;
	}

	@Override
	@Generated("com.reprezen.jsonoverlay.gen.CodeGenerator")
	public Class<?> _getModelType() {
		return OpenApi3.class;
	}
}
