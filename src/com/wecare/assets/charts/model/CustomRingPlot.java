package com.wecare.assets.charts.model;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.jfree.chart.plot.RingPlot;
import org.jfree.data.general.DefaultPieDataset;

public class CustomRingPlot extends RingPlot {
    public CustomRingPlot(DefaultPieDataset dataSet) {
        super(dataSet);
    }

    @Override
    protected Rectangle2D getArcBounds(Rectangle2D unexploded, Rectangle2D exploded, double angle, double extent, double explodePercent) {
        if(explodePercent > 0.0){
            this.setSectionDepth(0.33);//to match inner arc
            java.awt.geom.Arc2D.Double arc1 = new java.awt.geom.Arc2D.Double(unexploded, angle, extent / 2.0D, 0);
            Point2D point1 = arc1.getEndPoint();
            Rectangle2D mix = new Rectangle2D.Double(exploded.getX(), exploded.getY(), unexploded.getWidth(), unexploded.getHeight());
            java.awt.geom.Arc2D.Double arc2 = new java.awt.geom.Arc2D.Double(mix, angle, extent / 2.0D, 0);

            Point2D point2 = arc2.getEndPoint();
            double deltaX = (point1.getX() - point2.getX()) * explodePercent;
            double deltaY = (point1.getY() - point2.getY()) * explodePercent;
            return new java.awt.geom.Rectangle2D.Double(unexploded.getX() - deltaX, unexploded.getY() - deltaY, exploded.getWidth(), exploded.getHeight());
        } else {
            this.setSectionDepth(0.3);//default depth
            return super.getArcBounds(unexploded, exploded, angle, extent, explodePercent);
        }
    }
}
