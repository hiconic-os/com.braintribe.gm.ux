// ============================================================================
// Copyright BRAINTRIBE TECHNOLOGY GMBH, Austria, 2002-2022
// 
// This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
// 
// This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public License along with this library; See http://www.gnu.org/licenses/.
// ============================================================================
package com.braintribe.gm.ux.graph;

import java.util.Set;

import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;

/**
 * <p>
 * A {@link Graph} holds {@link GraphElement graph elements} and is itself a {@link GraphElement}.
 *
 */
public interface Graph extends GraphElement {

	EntityType<Graph> T = EntityTypes.T(Graph.class);
	
	Set<Node> getNodes();
	void setNodes(Set<Node> nodes);
	
	Set<Edge> getEdges();
	void setEdges(Set<Edge> edges);
	
}
