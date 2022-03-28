({
    adoptBird : function(component, event, helper) {
        let action = component.get('c.randomBird');

        action.setCallback(this, function (response){
            let state = response.getState();
            let result = response.getReturnValue();

            component.set('v.names', result[0]);
            component.set('v.breeds', result[1]);
            component.set('v.photos', result[2]);
            component.set('v.colors', result[3]);
        })
        
        $A.enqueueAction(action);
    }
})