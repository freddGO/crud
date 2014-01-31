Ext.application({
    name: 'testExtJS',
    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                    title: 'Hello ExtJS',
                    html : 'Hello! Welcome to Ext JS.'
                }
            ]
        });
    }
});